package com.example.event_management_system.entity;

import com.example.event_management_system.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends BaseEntity {

    private String fullName;


    @Column(unique = true, nullable = false)
    private String email;


    private String phone;


    private String password;


    private String collegeName;


    @Enumerated(EnumType.STRING)
    private Role role;


    private boolean isVerified;
}