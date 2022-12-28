package com.example.demo.calendar.controller;

import com.example.demo.dto.Calendar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CalendarController {
    private ArrayList<Calendar> calList = new ArrayList<>();

    @GetMapping("/all/schedule")
    public ArrayList<Calendar> allSchedule(){
        return calList;
    }

    @GetMapping("/put/schedule")
    public ArrayList<Calendar> putSchedule(Calendar calendar){
        for(Calendar cal : calList){
            if(cal.getDate().equals(calendar.getDate())){
                if(cal.getTitle().equals(calendar.getTitle())){
                    return calList;
                }
            }
        }
        calList.add(calendar);

        return calList;
    }
}
