package com.example.event_management_system.controller;

import com.example.event_management_system.dto.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public ApiResponse<String> getHealth(){
        return new ApiResponse<>(true,"application is working","Hello, !!");
    }

}
