package com.example.jpatodolist.controller;

import com.example.jpatodolist.dto.TodoResponse;
import com.example.jpatodolist.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/todos")
    public List<TodoResponse> todoList(){
        return todoService.todoList();
    }

    @PostMapping("/todos")
    public String insertTodos(String todos){
        return todoService.insertTodos(todos);
    }

    @DeleteMapping("/todos/{id}")
    public String deleteTodos(@PathVariable ("id") String id){
        return todoService.deleteTodos(id);
    }

}
