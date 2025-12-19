package com.example.event_management_system.mapper;

import com.example.event_management_system.dto.response.UserResponse;

public class UserMapper {


    public static UserResponse toResponse(User user) {
        UserResponse res = new UserResponse();
        res.setId(user.getId());
        res.setFullName(user.getFullName());
        res.setEmail(user.getEmail());
        res.setPhone(user.getPhone());
        res.setCollegeName(user.getCollegeName());
        res.setRole(user.getRole());
        return res;
    }
}