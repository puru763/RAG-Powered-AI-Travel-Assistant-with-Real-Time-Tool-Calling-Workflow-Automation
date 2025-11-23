package com.travelplatform.ai.repository;

import com.travelplatform.ai.entity.TravelBooking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TravelBookingRepository extends JpaRepository<TravelBooking, Long> {

    List<TravelBooking> findByUsername(String username);
}
