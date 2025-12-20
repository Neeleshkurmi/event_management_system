package com.example.event_management_system.service;

import com.example.event_management_system.dto.request.LoginRequest;
import com.example.event_management_system.dto.request.RegisterRequest;
import com.example.event_management_system.dto.response.AuthResponse;
import com.example.event_management_system.entity.User;
import com.example.event_management_system.enums.Role;
import com.example.event_management_system.mapper.UserMapper;
import com.example.event_management_system.repository.UserRepository;
import com.example.event_management_system.security.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {


        private final UserRepository userRepository;
        private final PasswordEncoder passwordEncoder;
        private final JwtService jwtService;


        @Override
        public AuthResponse register(RegisterRequest request) {
            User user = new User();
            user.setFullName(request.getFullName());
            user.setEmail(request.getEmail());
            user.setPhone(request.getPhone());
            user.setCollegeName(request.getCollegeName());
            user.setPassword(passwordEncoder.encode(request.getPassword()));
            user.setRole(Role.STUDENT);
            userRepository.save(user);


            String token = jwtService.generateToken(user);
            return new AuthResponse(token, UserMapper.toResponse(user));
        }


        @Override
        public AuthResponse login(LoginRequest request) {
            User user = userRepository.findByEmail(request.getEmail())
            .orElseThrow(() -> new RuntimeException("Invalid credentials"));


            if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }


        String token = jwtService.generateToken(user);
            return new AuthResponse(token, UserMapper.toResponse(user));
        }
}