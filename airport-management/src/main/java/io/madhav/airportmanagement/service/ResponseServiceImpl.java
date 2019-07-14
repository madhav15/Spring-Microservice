package io.madhav.airportmanagement.service;

import com.google.gson.Gson;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import io.madhav.airportmanagement.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service("responseService")
public class ResponseServiceImpl implements ResponseService {

    @Autowired
    RestTemplate restTemplate;

    private final static Logger LOGGER = LoggerFactory.getLogger(ResponseServiceImpl.class);

    public static final String PASSANGER_QUEUE = "passanger-queue";

    /**
     * Method to get Response of Microservices.
     *
     * @return the response.
     */
    @Override
    public List<CatalogResponse> getResponse() {
        final List<CatalogResponse> catalogResponseList = new ArrayList<>();

        final PassengerGroup passengerGroup = restTemplate.getForObject("http://airport-passanger/passangers/getPassangers",
                PassengerGroup.class);

        final List<Passenger> passengerList = passengerGroup.getPassengerList();

        if (CollectionUtils.isEmpty(passengerList)) {
            return null;
        }
        for (Passenger passenger : passengerList) {
            final BookingList bookingList =
                    restTemplate.getForObject("http://booking-management/bookings//bookinguser/"
                                    + passenger.getPassengerId(), BookingList.class);

            final CatalogResponse catalogResponse = new CatalogResponse();
            catalogResponse.setPassenger(passenger);
            catalogResponse.setBookingList(bookingList);
            catalogResponseList.add(catalogResponse);
        }
        return catalogResponseList;
    }

    /**
     *
     * @param catalogResponse
     * @return
     */
    public String saveData(CatalogResponse catalogResponse) {
        LOGGER.info("Save Catalog request received");
        try {
            final Passenger passenger = catalogResponse.getPassenger();
            if (passenger == null) {
                return "Passenger is null";
            }
            restTemplate.postForEntity("http://airport-passenger/passangers/savePassanger", passenger, Passenger.class);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.getMessage();
        }
        return "success";
    }

    /**
     *
     * @param passenger
     * @throws Exception
     */
    private void convertObjectToJson(Passenger passenger) throws Exception {
        final Gson gson = new Gson();
        final String str = gson.toJson(passenger);

        publishMessage(str);
    }

    /**
     *
     * @param message
     * @throws Exception
     */
    private void publishMessage(final String message) throws Exception {
        final ConnectionFactory factory = new ConnectionFactory();
        factory.setUri("amqp://guest:guest@localhost");
        factory.setConnectionTimeout(30000);

        final Connection connection = factory.newConnection();

        final Channel channel = connection.createChannel();

        channel.queueDeclare(PASSANGER_QUEUE, true, false, false, null);


        channel.basicPublish("", PASSANGER_QUEUE, null, message.getBytes());
        LOGGER.info("Published Message " + message);

        String response = restTemplate.getForObject("http://airport-passanger/passangers/listen", String.class);

        LOGGER.info(response);
    }

}
