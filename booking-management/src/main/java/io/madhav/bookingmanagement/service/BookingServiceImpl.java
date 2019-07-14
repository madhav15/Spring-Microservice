package io.madhav.bookingmanagement.service;

import io.madhav.bookingmanagement.model.Booking;
import io.madhav.bookingmanagement.model.BookingList;
import io.madhav.bookingmanagement.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookingService")
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    /**
     * Method to get all bookings by user.
     *
     * @param user the user id string.
     * @return the booking list.
     */
    @Override
    public BookingList getBookingsByUser(final String user) {
        final Long userId = Long.parseLong(user);
        final List<Booking> bookingList = bookingRepository.findBookingByUserId(userId);
        return new BookingList(bookingList);
    }


}
