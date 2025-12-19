package com.example.event_management_system.entity;

import com.example.event_management_system.enums.NotificationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "notifications")
@Getter
@Setter
public class Notification extends BaseEntity {


        @ManyToOne
        private User user;


        private String title;


        @Column(length = 1000)
        private String message;


        @Enumerated(EnumType.STRING)
        private NotificationType type;


        private boolean isRead;
}