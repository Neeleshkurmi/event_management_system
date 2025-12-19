package com.example.event_management_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "colleges")
@Getter
@Setter
public class College extends BaseEntity {
    private String name;
    private String city;
    private String state;
}