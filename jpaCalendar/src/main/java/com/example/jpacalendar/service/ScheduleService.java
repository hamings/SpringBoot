package com.example.jpacalendar.service;

import com.example.jpacalendar.dto.ScheduleRequest;
import com.example.jpacalendar.dto.ScheduleResponse;


import java.util.List;

public interface ScheduleService {

    List<ScheduleResponse> scheduleList(String email);

    String deleteSchedule(String id);

    String insertSchedule(ScheduleRequest scheduleRequest);

}
