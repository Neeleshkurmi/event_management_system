package com.example.event_management_system.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserResponse {
private UUID id;
private String fullName;
private String email;
private String phone;
private String collegeName;
private Role role;
}