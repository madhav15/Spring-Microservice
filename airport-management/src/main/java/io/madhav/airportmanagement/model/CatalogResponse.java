package io.madhav.airportmanagement.model;

public class CatalogResponse {
     private Passenger passenger;

     private BookingList bookingList;

    public CatalogResponse() {

    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public BookingList getBookingList() {
        return bookingList;
    }

    public void setBookingList(BookingList bookingList) {
        this.bookingList = bookingList;
    }
}
