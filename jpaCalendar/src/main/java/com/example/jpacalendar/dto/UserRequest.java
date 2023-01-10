package com.example.jpacalendar.dto;

import com.example.jpacalendar.entity.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRequest {

    private String email;

    private String password;

    public User toEntity(){
        return User.builder()
                .email(this.email)
                .password(this.password)
                .build();
    }
}
