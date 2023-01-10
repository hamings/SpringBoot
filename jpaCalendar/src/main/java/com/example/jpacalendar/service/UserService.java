package com.example.jpacalendar.service;

import com.example.jpacalendar.dto.UserRequest;

public interface UserService {

    String insertUser(UserRequest userRequest);

    String selectUser(UserRequest userRequest);
}
