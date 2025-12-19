package com.example.event_management_system.dto.response;

import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class SubEventResponse {
private UUID id;
private String title;
private String description;
private LocalDate eventDate;
private LocalTime startTime;
private LocalTime endTime;
private BigDecimal registrationFee;
}