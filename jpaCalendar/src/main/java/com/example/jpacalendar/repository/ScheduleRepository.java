package com.example.jpacalendar.repository;

import com.example.jpacalendar.entity.Schedule;
import com.example.jpacalendar.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule,Long> {
    List<Schedule> findByUser(User user);
}
