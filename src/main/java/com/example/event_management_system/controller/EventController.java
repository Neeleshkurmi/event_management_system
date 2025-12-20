package com.example.event_management_system.controller;

import com.example.event_management_system.dto.request.EventCreateRequest;
import com.example.event_management_system.dto.response.ApiResponse;
import com.example.event_management_system.dto.response.EventResponse;
import com.example.event_management_system.entity.User;
import com.example.event_management_system.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
@RequiredArgsConstructor
public class EventController {


private final EventService eventService;


    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ApiResponse<EventResponse> createEvent(
        @RequestBody EventCreateRequest request,
        @AuthenticationPrincipal User admin) {


        return new ApiResponse<>(true, "Event created",
        eventService.createEvent(request, admin));
    }


    @GetMapping
    public ApiResponse<List<EventResponse>> getAllEvents() {
        return new ApiResponse<>(true, "Events fetched", eventService.getAllEvents());
    }
}