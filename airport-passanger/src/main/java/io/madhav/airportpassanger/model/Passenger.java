package io.madhav.airportpassanger.model;

import javax.persistence.*;

@Entity
@Table(name = "passenger")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "passenger_id")
    private int passengerId;

    @Column(name = "passenger_name")
    private String passengerName;

    @Column(name = "seat_details")
    private String seatDetails;

    public Passenger() {
    }

    public Passenger(int passengerId, String passengerName, String seatDetails) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.seatDetails = seatDetails;
    }

    public Integer getPassengerId() {
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
}
