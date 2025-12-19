package com.example.event_management_system.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDate;

@Getter
@Setter
public class EventResponse {
private UUID id;
private String title;
private String description;
private String venue;
private LocalDate startDate;
private LocalDate endDate;
private boolean active;
}