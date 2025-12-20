package com.example.event_management_system.repository;

import com.example.event_management_system.entity.SubEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubEventRepository extends JpaRepository<SubEvent, Long> {


    List<SubEvent> findByEventId(Long eventId);


    long countByEventId(Long eventId);
}