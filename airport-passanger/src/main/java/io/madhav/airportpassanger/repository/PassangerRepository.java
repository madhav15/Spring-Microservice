package io.madhav.airportpassanger.repository;

import io.madhav.airportpassanger.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassangerRepository extends JpaRepository<Passenger, Long> {
}
