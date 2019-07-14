package io.madhav.bookingmanagement.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "passanger_booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "booking_id")
    private Long bookingId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "booking_details")
    private String bookingDetails;

    @Column(name = "booking_date")
    private Date bookingDate;

    public Booking() {

    }

    public Booking(final Long bookingId, final Long userId, final String bookingDetails, final Date bookingDate) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.bookingDetails = bookingDetails;
        this.bookingDate = bookingDate;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(final Long bookingId) {
        this.bookingId = bookingId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    public String getBookingDetails() {
        return bookingDetails;
    }

    public void setBookingDetails(final String bookingDetails) {
        this.bookingDetails = bookingDetails;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(final Date bookingDate) {
        this.bookingDate = bookingDate;
    }
}
