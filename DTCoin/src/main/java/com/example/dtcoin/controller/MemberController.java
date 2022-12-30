package com.example.dtcoin.controller;

import com.example.dtcoin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class MemberController {

    @Autowired
    MemberService ms;

    @PostMapping("/signup")
    public String insertMember(@RequestParam HashMap<String,String> params){
        if(ms.loginMember(params)==null) {
            ms.insertMember(params);
            return "login";
        } return "signup";
    }
    @PostMapping("/login")
    public String loginMember(@RequestParam HashMap<String,String> params, HttpSession session){
        if(ms.loginMember(params)!=null){
            session.setAttribute("email",params.get("email"));
            return "redirect:/";
        }
        return "login";
    }

}


