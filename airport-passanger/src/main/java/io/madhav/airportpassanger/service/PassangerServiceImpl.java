package io.madhav.airportpassanger.service;

import io.madhav.airportpassanger.model.Passenger;
import io.madhav.airportpassanger.model.PassangerGroup;
import io.madhav.airportpassanger.repository.PassangerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("passangerService")
public class PassangerServiceImpl implements PassangerService {

    private final static Logger LOGGER = LoggerFactory.getLogger(PassangerServiceImpl.class);

    public static final String PASSANGER_QUEUE = "passanger-queue";

    @Autowired
    PassangerRepository passangerRepository;

    @Override
    public PassangerGroup getAllPassangers() {

        final List<Passenger> passengerList = passangerRepository.findAll();

        return new PassangerGroup(passengerList);
    }

    /**
     * Method to save passenger in database.
     *
     * @param passenger
     * @return
     */
    @Override
    public Passenger savePassanger(final Passenger passenger) {
        LOGGER.info("Save Passenger Object to database.");
        return passangerRepository.save(passenger);
    }

}
