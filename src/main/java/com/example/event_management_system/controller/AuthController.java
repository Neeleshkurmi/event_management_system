package com.example.event_management_system.controller;

import com.example.event_management_system.dto.request.LoginRequest;
import com.example.event_management_system.dto.request.RegisterRequest;
import com.example.event_management_system.dto.response.ApiResponse;
import com.example.event_management_system.dto.response.AuthResponse;
import com.example.event_management_system.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {


    private final AuthService authService;


    @PostMapping("/register")
        public ApiResponse<AuthResponse> register(@RequestBody RegisterRequest request) {
        System.out.println("DEBUG: POINTER HERE, starting register for user: "+request);
        return new ApiResponse<>(true, "User registered", authService.register(request));
    }


    @PostMapping("/login")
        public ApiResponse<AuthResponse> login(@RequestBody LoginRequest request) {
        return new ApiResponse<>(true, "Login successful", authService.login(request));
    }
}