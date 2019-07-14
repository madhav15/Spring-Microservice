package io.madhav.bookingmanagement.service;

import io.madhav.bookingmanagement.model.Booking;
import io.madhav.bookingmanagement.model.BookingList;

import java.util.List;

public interface BookingService {
    BookingList getBookingsByUser(String userId);
}
