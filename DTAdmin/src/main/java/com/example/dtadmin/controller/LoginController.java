package com.example.dtadmin.controller;

import com.example.dtadmin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class LoginController {

    @Autowired
    AdminService service;

    @PostMapping("/login")
    public String login(@RequestParam HashMap<String,Object> params, HttpSession session){
        if(service.selectAdmin(params)==null){
            return "redirect:/";
        }
        session.setAttribute("id",params.get("id"));
        return "index";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }

}
