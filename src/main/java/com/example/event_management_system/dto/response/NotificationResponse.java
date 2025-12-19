package com.example.event_management_system.dto.response;

import com.example.event_management_system.enums.NotificationType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class NotificationResponse {
private Long id;
private String title;
private String message;
private NotificationType type;
private boolean read;
private LocalDateTime createdAt;
}