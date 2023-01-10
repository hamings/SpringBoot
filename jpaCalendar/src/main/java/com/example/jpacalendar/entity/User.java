package com.example.jpacalendar.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "schedule_user")
public class User {


    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @OneToMany(fetch = FetchType.LAZY)
    @OrderBy("date DESC")
    private List<Schedule> schedules;

}
