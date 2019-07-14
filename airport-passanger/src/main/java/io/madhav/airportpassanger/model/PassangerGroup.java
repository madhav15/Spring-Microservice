package io.madhav.airportpassanger.model;

import java.util.List;

public class PassangerGroup {

    private List<Passenger> passengerList;

    public PassangerGroup() {

    }

    public PassangerGroup(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
}
