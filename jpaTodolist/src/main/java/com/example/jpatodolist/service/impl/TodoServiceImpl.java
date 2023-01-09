package com.example.jpatodolist.service.impl;

import com.example.jpatodolist.dto.TodoResponse;
import com.example.jpatodolist.entity.Todo;
import com.example.jpatodolist.repository.TodoRepository;
import com.example.jpatodolist.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public List<TodoResponse> todoList() {
        return todoRepository.findAll().stream()
                .map(todo -> new TodoResponse(todo))
                .collect(Collectors.toList());
    }

    @Override
    public String insertTodos(String todos) {
        try{
            todoRepository.save(Todo.builder().todos(todos).build());
        }catch(Exception e) {
            return "fail";
        }
        return "success";
    }

    @Override
    public String deleteTodos(String id) {
        try{
            todoRepository.deleteById(Long.parseLong(id));
        }catch (Exception e){
            return "fail";
        }
        return "success";
    }
}
