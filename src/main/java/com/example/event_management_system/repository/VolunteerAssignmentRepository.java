package com.example.event_management_system.repository;

import com.example.event_management_system.entity.VolunteerAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VolunteerAssignmentRepository extends JpaRepository<VolunteerAssignment, Long> {


List<VolunteerAssignment> findByVolunteerId(Long volunteerId);
}