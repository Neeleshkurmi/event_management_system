package com.example.event_management_system.mapper;

import com.example.event_management_system.dto.response.EventResponse;

public class EventMapper {


public static EventResponse toResponse(Event event) {
EventResponse res = new EventResponse();
res.setId(event.getId());
res.setTitle(event.getTitle());
res.setDescription(event.getDescription());
res.setVenue(event.getVenue());
res.setStartDate(event.getStartDate());
res.setEndDate(event.getEndDate());
res.setActive(event.isActive());
return res;
}
}