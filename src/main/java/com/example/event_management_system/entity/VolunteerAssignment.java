package com.example.event_management_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "volunteer_assignments")
@Getter
@Setter
public class VolunteerAssignment extends BaseEntity {


        @ManyToOne
        private User volunteer;


        @ManyToOne
        private SubEvent subEvent;
}