package com.example.jpacalendar.dto;

import com.example.jpacalendar.entity.Schedule;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
public class ScheduleResponse {

    private Long id;

    private String title;

    private String date;

    public ScheduleResponse(Schedule schedule){
        this.id = schedule.getId();
        this.title = schedule.getTitle();
        this.date = schedule.getDate();
    }

}
