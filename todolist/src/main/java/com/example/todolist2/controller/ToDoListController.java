package com.example.todolist2.controller;

import com.example.todolist2.mapper.TodoListMapper;
import com.example.todolist2.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class ToDoListController {

    @Autowired
    TodoListService ts;

    @GetMapping("/list")
    public ArrayList<HashMap<String,Object>> list(){
        return ts.selectTodo();
    }

    @GetMapping("/receiveList")
    public ArrayList<HashMap<String,Object>> receiveList(String todo){
        ts.insertTodo(todo);
        return ts.selectTodo();
    }

    @GetMapping("/deleteList")
    public ArrayList<HashMap<String,Object>> deleteList(String todo){
        HashMap<String, Object> params = new HashMap<>();
        params.put("id",todo);
        ts.deleteTodo(params);
        return ts.selectTodo();
    }


}
