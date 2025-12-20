package com.example.event_management_system.repository;

import com.example.event_management_system.entity.EventRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRegistrationRepository extends JpaRepository<EventRegistration, Long> {


boolean existsByUserIdAndSubEventId(Long userId, Long subEventId);


List<EventRegistration> findByUserId(Long userId);


long countBySubEventId(Long subEventId);
}