package com.example.event_management_system.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AuthResponse {
private String token;
private UserResponse user;
}