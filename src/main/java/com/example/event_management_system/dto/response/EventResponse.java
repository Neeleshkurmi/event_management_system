package com.example.event_management_system.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class EventResponse {
private Long id;
private String title;
private String description;
private String venue;
private LocalDate startDate;
private LocalDate endDate;
private boolean active;
}