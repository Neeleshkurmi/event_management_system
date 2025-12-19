package com.example.event_management_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "sub_events")
@Getter
@Setter
public class SubEvent extends BaseEntity {


        @ManyToOne
        private Event event;


        private String title;


        @Column(length = 1000)
        private String description;


        private LocalDate eventDate;
        private LocalTime startTime;
        private LocalTime endTime;


        private BigDecimal registrationFee;


        private Integer maxParticipants;
}