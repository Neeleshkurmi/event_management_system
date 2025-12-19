package com.example.event_management_system.entity;

import com.example.event_management_system.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "payments")
@Getter
@Setter
public class Payment extends BaseEntity {


        @ManyToOne
        private User user;


        private BigDecimal amount;


        private String method;


        @Enumerated(EnumType.STRING)
        private PaymentStatus status;


        private String transactionId;
}