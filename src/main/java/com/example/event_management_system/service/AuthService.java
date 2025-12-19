package com.example.event_management_system.service;

import com.example.event_management_system.dto.request.LoginRequest;
import com.example.event_management_system.dto.request.RegisterRequest;
import com.example.event_management_system.dto.response.AuthResponse;

public interface AuthService {
        AuthResponse register(RegisterRequest request);
        AuthResponse login(LoginRequest request);
}