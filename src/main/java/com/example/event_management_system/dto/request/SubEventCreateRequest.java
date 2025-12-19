package com.example.event_management_system.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class SubEventCreateRequest {
private UUID eventId;
private String title;
private String description;
private LocalDate eventDate;
private LocalTime startTime;
private LocalTime endTime;
private BigDecimal registrationFee;
private Integer maxParticipants;
}