package com.example.event_management_system.entity;

import com.example.event_management_system.enums.PaymentStatus;
import com.example.event_management_system.enums.RegistrationStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "event_registrations",
uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "sub_event_id"}))
@Getter
@Setter
public class EventRegistration extends BaseEntity {


        @ManyToOne
        private User user;


        @ManyToOne
        private SubEvent subEvent;


        @Enumerated(EnumType.STRING)
        private PaymentStatus paymentStatus;


        private String paymentRef;


        @Enumerated(EnumType.STRING)
        private RegistrationStatus status;


        private LocalDateTime registeredAt;
}