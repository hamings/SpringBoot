package com.example.jpacalendar.controller;

import com.example.jpacalendar.dto.ScheduleRequest;
import com.example.jpacalendar.dto.ScheduleResponse;
import com.example.jpacalendar.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService service;

    @GetMapping("/schedules")
    public List<ScheduleResponse> scheduleList(HttpSession session){
        return service.scheduleList(String.valueOf(session.getAttribute("email")));
    }

    @DeleteMapping("/schedules/{id}")
    public String deleteById(@PathVariable ("id") String id){
        return service.deleteSchedule(id);
    }

    @PostMapping("/schedules")
    public String insertSchedule(ScheduleRequest scheduleRequest, HttpSession session){
        scheduleRequest.setEmail(String.valueOf(session.getAttribute("email")));
        return service.insertSchedule(scheduleRequest);
    }


}
