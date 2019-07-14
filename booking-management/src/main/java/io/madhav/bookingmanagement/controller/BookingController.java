package io.madhav.bookingmanagement.controller;


import io.madhav.bookingmanagement.model.BookingList;
import io.madhav.bookingmanagement.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @RequestMapping("/bookinguser/{userId}")
    public BookingList getBookingByUser(@PathVariable("userId") final String userId) {
        return bookingService.getBookingsByUser(userId);
    }

}
