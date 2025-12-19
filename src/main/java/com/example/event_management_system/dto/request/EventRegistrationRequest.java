package com.example.event_management_system.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;

@Getter
@Setter
public class EventRegistrationRequest {
private UUID subEventId;
}