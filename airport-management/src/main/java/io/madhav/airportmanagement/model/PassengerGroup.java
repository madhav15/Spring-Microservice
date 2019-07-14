package io.madhav.airportmanagement.model;

import java.util.List;

public class PassengerGroup {

    private List<Passenger> passengerList;

    public PassengerGroup() {
        // Constructor
    }

    public PassengerGroup(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
}
