package com.example.jpatodolist.dto;

import com.example.jpatodolist.entity.Todo;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TodoResponse {

    private String id;

    private String todos;

    public TodoResponse(Todo todo){
        this.id  = String.valueOf(id);
        this.todos = todos;
    }


}
