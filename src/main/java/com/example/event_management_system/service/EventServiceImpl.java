package com.example.event_management_system.service;

import com.example.event_management_system.dto.request.EventCreateRequest;
import com.example.event_management_system.dto.response.EventResponse;
import com.example.event_management_system.entity.Event;
import com.example.event_management_system.entity.EventCategory;
import com.example.event_management_system.entity.User;
import com.example.event_management_system.mapper.EventMapper;
import com.example.event_management_system.repository.EventCategoryRepository;
import com.example.event_management_system.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {


        private final EventRepository eventRepository;
        private final EventCategoryRepository categoryRepository;


        @Override
        public EventResponse createEvent(EventCreateRequest request, User admin) {
                EventCategory category = categoryRepository.findById(request.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));


                Event event = new Event();
                event.setCategory(category);
                event.setTitle(request.getTitle());
                event.setDescription(request.getDescription());
                event.setVenue(request.getVenue());
                event.setStartDate(request.getStartDate());
                event.setEndDate(request.getEndDate());
                event.setCreatedBy(admin);
                event.setActive(true);


                return EventMapper.toResponse(eventRepository.save(event));
        }


        @Override
        public List<EventResponse> getAllEvents() {
            return eventRepository.findAll()
            .stream()
            .map(EventMapper::toResponse)
            .toList();
        }
}