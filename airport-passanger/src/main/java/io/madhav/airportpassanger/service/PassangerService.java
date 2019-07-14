package io.madhav.airportpassanger.service;

import io.madhav.airportpassanger.model.Passenger;
import io.madhav.airportpassanger.model.PassangerGroup;

public interface PassangerService {

    PassangerGroup getAllPassangers();

    Passenger savePassanger(Passenger passenger);
}
