package com.example.jpacalendar.service.impl;

import com.example.jpacalendar.dto.UserRequest;
import com.example.jpacalendar.repository.UserRepository;
import com.example.jpacalendar.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public String insertUser(UserRequest userRequest) {
        try{
            repository.save(userRequest.toEntity());
        }catch (Exception e){
            return "fail";
        }
        return "success";
    }

    @Override
    public String selectUser(UserRequest userRequest) {
        try{
            repository.findByEmailAndPassword(userRequest.getEmail(),userRequest.getPassword());
        }catch (Exception e){
            return "fail";
        }
        return "success";
    }
}
