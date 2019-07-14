package io.madhav.airportmanagement.model;

public class Passenger {

    private int passengerId;

    private String passengerName;

    private String seatDetails;

    public Passenger() {
    }

    public Passenger(int passengerId, String passengerName, String seatDetails) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.seatDetails = seatDetails;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getSeatDetails() {
        return seatDetails;
    }

    public void setSeatDetails(String seatDetails) {
        this.seatDetails = seatDetails;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId=" + passengerId +
                ", passengerName='" + passengerName + '\'' +
                ", seatDetails='" + seatDetails + '\'' +
                '}';
    }
}
