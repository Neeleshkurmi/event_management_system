package com.example.event_management_system.mapper;

import com.example.event_management_system.dto.response.EventRegistrationResponse;
import com.example.event_management_system.entity.EventRegistration;

public class EventRegistrationMapper {


    public static EventRegistrationResponse toResponse(EventRegistration er) {
        EventRegistrationResponse res = new EventRegistrationResponse();
        res.setRegistrationId(er.getId());
        res.setSubEventTitle(er.getSubEvent().getTitle());
        res.setStatus(er.getStatus());
        res.setPaymentStatus(er.getPaymentStatus());
        return res;
    }
}