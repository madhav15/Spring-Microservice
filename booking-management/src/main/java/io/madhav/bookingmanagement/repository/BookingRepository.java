package io.madhav.bookingmanagement.repository;

import io.madhav.bookingmanagement.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    /**
     * JPA method to find all Bookings by User.
     *
     * @param userId the user id.
     * @return the list of bookings by user.
     */
    List<Booking> findBookingByUserId(Long userId);
}
