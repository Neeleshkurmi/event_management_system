package com.example.event_management_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "event_categories")
@Getter
@Setter
public class EventCategory extends BaseEntity {
    private String name;


    @Column(length = 500)
    private String description;
}