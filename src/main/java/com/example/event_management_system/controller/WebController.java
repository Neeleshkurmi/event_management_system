package com.example.event_management_system.controller;

import com.example.event_management_system.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class WebController {

    private final EventService eventService;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @GetMapping("/events")
    public String eventsPage(Model model) {
        // Uses the existing service to fetch events for the UI
        model.addAttribute("events", eventService.getAllEvents());
        return "events";
    }
}