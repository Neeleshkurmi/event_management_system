package com.example.event_management_system.controller;

import com.example.event_management_system.dto.request.LoginRequest;
import com.example.event_management_system.dto.request.RegisterRequest;
import com.example.event_management_system.service.AuthService;
import com.example.event_management_system.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class WebController {

    private final EventService eventService;
    private final AuthService authService;

    @GetMapping("/")
    public String homePage(){
        return "home";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String email, @RequestParam String password, Model model) {
        try {
            LoginRequest request = new LoginRequest();
            request.setEmail(email);
            request.setPassword(password);
            var response = authService.login(request);
            // Store token and redirect
            return "redirect:/events";
        } catch (Exception e) {
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String registerSubmit(@RequestParam String fullName, 
                                  @RequestParam String email, 
                                  @RequestParam String password,
                                  @RequestParam String collegeName,
                                  Model model) {
        try {
            RegisterRequest request = new RegisterRequest();
            request.setFullName(fullName);
            request.setEmail(email);
            request.setPassword(password);
            request.setCollegeName(collegeName);
            authService.register(request);
            
            // Auto-login after registration and redirect to events
            LoginRequest loginRequest = new LoginRequest();
            loginRequest.setEmail(email);
            loginRequest.setPassword(password);
            authService.login(loginRequest);
            
            return "redirect:/events";
        } catch (Exception e) {
            model.addAttribute("error", "Registration failed: " + e.getMessage());
            return "register";
        }
    }

    @GetMapping("/events")
    public String eventsPage(Model model) {
        model.addAttribute("events", eventService.getAllEvents());
        return "events";
    }
}