package com.travelplatform.ai.service;

import com.travelplatform.ai.entity.TravelBooking;
import com.travelplatform.ai.model.TravelBookingRequest;
import com.travelplatform.ai.repository.TravelBookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TravelBookingService {

    private final TravelBookingRepository travelBookingRepository;

    public TravelBooking createBooking(TravelBookingRequest bookingRequest, String username) {
        TravelBooking booking = TravelBooking.builder()
                .destination(bookingRequest.destination())
                .travelType(bookingRequest.travelType())
                .details(bookingRequest.details())
                .username(username)
                .status("PENDING")
                .createdAt(LocalDateTime.now())
                .travelDate(LocalDateTime.now().plusDays(14))
                .build();
        return travelBookingRepository.save(booking);
    }

    public List<TravelBooking> getBookingsByUsername(String username) {
        return travelBookingRepository.findByUsername(username);
    }

    public TravelBooking updateBookingStatus(Long bookingId, String status) {
        TravelBooking booking = travelBookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
        booking.setStatus(status);
        return travelBookingRepository.save(booking);
    }

}
