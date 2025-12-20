package com.example.event_management_system.service;

import com.example.event_management_system.dto.response.EventRegistrationResponse;
import com.example.event_management_system.entity.EventRegistration;
import com.example.event_management_system.entity.SubEvent;
import com.example.event_management_system.entity.User;
import com.example.event_management_system.enums.PaymentStatus;
import com.example.event_management_system.enums.RegistrationStatus;
import com.example.event_management_system.mapper.EventRegistrationMapper;
import com.example.event_management_system.repository.EventRegistrationRepository;
import com.example.event_management_system.repository.SubEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {


        private final EventRegistrationRepository registrationRepository;
        private final SubEventRepository subEventRepository;


        @Override
        public EventRegistrationResponse register(Long subEventId, User user) {
            SubEvent subEvent = subEventRepository.findById(subEventId)
            .orElseThrow(() -> new RuntimeException("Sub-event not found"));


            EventRegistration registration = new EventRegistration();
            registration.setUser(user);
            registration.setSubEvent(subEvent);
            registration.setStatus(RegistrationStatus.REGISTERED);
            registration.setPaymentStatus(PaymentStatus.PENDING);
            registration.setRegisteredAt(LocalDateTime.now());


            return EventRegistrationMapper.toResponse(registrationRepository.save(registration));
        }
}