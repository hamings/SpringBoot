package com.example.jpacalendar.controller;

import com.example.jpacalendar.dto.UserRequest;
import com.example.jpacalendar.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/users")
    public String insertUser(UserRequest userRequest){
        return service.insertUser(userRequest);
    }

    @PostMapping("/login")
    public String login(UserRequest userRequest, HttpSession session){
        String resp = service.selectUser(userRequest);
        if(resp.equals("success")){
            session.setAttribute("email",userRequest.getEmail());
        }
        return resp;
    }
}
