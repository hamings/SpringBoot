package com.example.jpacalendar.dto;

import com.example.jpacalendar.entity.Schedule;
import com.example.jpacalendar.entity.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ScheduleRequest {

    private String email;
    private String title;
    private String date;

    private Schedule toEntity(){
        return Schedule.builder()
                .user(User.builder().email(this.email).build())
                .title(this.title)
                .date(this.date)
                .build();
    }
}
