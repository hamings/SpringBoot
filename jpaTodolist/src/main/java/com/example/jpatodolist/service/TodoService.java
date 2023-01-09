package com.example.jpatodolist.service;

import com.example.jpatodolist.dto.TodoResponse;

import java.util.List;

public interface TodoService {

    List<TodoResponse> todoList();

    String insertTodos(String todos);

    String deleteTodos(String id);

}
