package com.example.event_management_system.service;

import com.example.event_management_system.dto.request.EventCreateRequest;
import com.example.event_management_system.dto.response.EventResponse;
import com.example.event_management_system.entity.User;

import java.util.List;

public interface EventService {
        EventResponse createEvent(EventCreateRequest request, User admin);
        List<EventResponse> getAllEvents();
}