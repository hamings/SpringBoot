package com.example.jpacalendar.service.impl;

import com.example.jpacalendar.dto.ScheduleRequest;
import com.example.jpacalendar.dto.ScheduleResponse;
import com.example.jpacalendar.entity.User;
import com.example.jpacalendar.repository.ScheduleRepository;
import com.example.jpacalendar.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository repository;

    @Override
    public List<ScheduleResponse> scheduleList(String email) {
        return repository.findByUser(User.builder().email(email).build()).stream()
                .map(schedule -> new ScheduleResponse(schedule))
                .collect(Collectors.toList());
    }

    @Override
    public String deleteSchedule(String id) {
        try{
            repository.deleteById(Long.parseLong(id));
        }catch (Exception e){
            return "fail";
        }
        return "success";
    }

    @Override
    public String insertSchedule(ScheduleRequest scheduleRequest) {
        try{
            repository.save(scheduleRequest.toEntity());
        }catch (Exception e){
            return "fail";
        }
        return "success";
    }
}
