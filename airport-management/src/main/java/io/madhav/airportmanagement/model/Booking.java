package io.madhav.airportmanagement.model;

import java.util.Date;

public class Booking {

        private Long bookingId;

        private Long userId;

        private String bookingDetails;

        private Date bookingDate;

        public Booking() {

        }

        public Booking(Long bookingId, Long userId, String bookingDetails, Date bookingDate) {
            this.bookingId = bookingId;
            this.userId = userId;
            this.bookingDetails = bookingDetails;
            this.bookingDate = bookingDate;
        }

        public Long getBookingId() {
            return bookingId;
        }

        public void setBookingId(Long bookingId) {
            this.bookingId = bookingId;
        }

        public String getBookingDetails() {
            return bookingDetails;
        }

        public void setBookingDetails(String bookingDetails) {
            this.bookingDetails = bookingDetails;
        }

        public Date getBookingDate() {
            return bookingDate;
        }

        public void setBookingDate(Date bookingDate) {
            this.bookingDate = bookingDate;
        }
}
