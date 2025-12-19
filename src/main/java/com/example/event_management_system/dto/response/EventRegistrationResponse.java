package com.example.event_management_system.dto.response;

import com.example.event_management_system.enums.PaymentStatus;
import com.example.event_management_system.enums.RegistrationStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class EventRegistrationResponse {
        private Long registrationId;
        private String subEventTitle;
        private RegistrationStatus status;

        public void setPaymentStatus(PaymentStatus paymentStatus) {
        }
        //private PaymentStatus paymentStatus;
}