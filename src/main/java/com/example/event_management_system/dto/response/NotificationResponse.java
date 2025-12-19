package com.example.event_management_system.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;

@Getter
@Setter
public class NotificationResponse {
private UUID id;
private String title;
private String message;
private NotificationType type;
private boolean read;
private LocalDateTime createdAt;
}