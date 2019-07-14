package io.madhav.airportpassanger.controller;

import io.madhav.airportpassanger.model.Passenger;
import io.madhav.airportpassanger.model.PassangerGroup;
import io.madhav.airportpassanger.service.PassangerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passangers")
public class PassangerController {

    private final static Logger LOGGER = LoggerFactory.getLogger(PassangerController.class);

    public static final String PASSANGER_QUEUE = "passanger-queue";


    @Autowired
    private PassangerService passangerService;

    @RequestMapping("/getPassangers")
    public PassangerGroup getAllPassangers() {
        LOGGER.info("Request to get all passangers");
        return passangerService.getAllPassangers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/savePassanger")
    public Passenger savePassanger(@RequestBody final Passenger passenger) {
        return passangerService.savePassanger(passenger);
    }
}
