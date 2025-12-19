package com.example.event_management_system.mapper;

import com.example.event_management_system.dto.response.SubEventResponse;
import com.example.event_management_system.entity.SubEvent;

public class SubEventMapper {


    public static SubEventResponse toResponse(SubEvent se) {
        SubEventResponse res = new SubEventResponse();
        res.setId(se.getId());
        res.setTitle(se.getTitle());
        res.setDescription(se.getDescription());
        res.setEventDate(se.getEventDate());
        res.setStartTime(se.getStartTime());
        res.setEndTime(se.getEndTime());
        res.setRegistrationFee(se.getRegistrationFee());
        return res;
    }
}