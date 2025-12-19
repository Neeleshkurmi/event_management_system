package com.example.event_management_system.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;

@Getter
@Setter
public class EventRegistrationResponse {
private UUID registrationId;
private String subEventTitle;
private RegistrationStatus status;
private PaymentStatus paymentStatus;
}