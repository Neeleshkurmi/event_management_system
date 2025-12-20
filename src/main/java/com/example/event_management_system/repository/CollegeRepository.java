package com.example.event_management_system.repository;

import com.example.event_management_system.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {


    Optional<College> findByName(String name);
}