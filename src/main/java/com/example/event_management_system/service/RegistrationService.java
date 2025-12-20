package com.example.event_management_system.service;

import com.example.event_management_system.dto.response.EventRegistrationResponse;
import com.example.event_management_system.entity.User;

public interface RegistrationService {
    EventRegistrationResponse register(Long subEventId, User user);
}