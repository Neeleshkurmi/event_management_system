package com.example.event_management_system.controller;

import com.example.event_management_system.dto.request.EventRegistrationRequest;
import com.example.event_management_system.dto.response.ApiResponse;
import com.example.event_management_system.dto.response.EventRegistrationResponse;
import com.example.event_management_system.entity.User;
import com.example.event_management_system.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/registrations")
@RequiredArgsConstructor
public class RegistrationController {


    private final RegistrationService registrationService;


    @PostMapping
        public ApiResponse<EventRegistrationResponse> register(
        @RequestBody EventRegistrationRequest request,
        @AuthenticationPrincipal User user) {


        return new ApiResponse<>(true, "Registered successfully",
        registrationService.register(request.getSubEventId(), user));
    }
}