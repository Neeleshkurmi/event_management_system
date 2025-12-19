package com.example.event_management_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "events")
@Getter
@Setter
public class Event extends BaseEntity {

        @ManyToOne
        private EventCategory category;


        private String title;


        @Column(length = 1000)
        private String description;


        private String venue;


        private LocalDate startDate;
        private LocalDate endDate;


        @ManyToOne
        private User createdBy;


        private boolean isActive;
}