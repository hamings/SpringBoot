package com.example.dtcoin.controller;

import com.example.dtcoin.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class ContactController {

    @Autowired
    ContactService cs;

    @PostMapping("/subscribe")
    public String subscribe(@RequestParam HashMap<String,String> params){
        cs.subscribe(params);
        return params.get("url");
    }

    @PostMapping("/requestCall")
    public String requestCall(@RequestParam HashMap<String,String> params){
        cs.requestCall(params);
        return "redirect:/";
    }
}
