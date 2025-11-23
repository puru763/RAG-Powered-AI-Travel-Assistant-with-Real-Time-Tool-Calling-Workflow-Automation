package com.travelplatform.ai.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "travel_bookings")
public class TravelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String destination;

    private String travelType;

    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime travelDate;

    private String details;

}
