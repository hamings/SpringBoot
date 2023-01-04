package com.example.dtcoin.controller;

import com.example.dtcoin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
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
    @GetMapping("/hadBalance")
    public @ResponseBody int hadBalance(HttpSession session){
        if(session.getAttribute("email")!=null){
            String email = String.valueOf(session.getAttribute("email"));
            return ms.hadBalance(email);
        }
        return 0;
    }
    @GetMapping("/havingBalance")
    public @ResponseBody ArrayList<HashMap<String,Object>> havingBalance(HttpSession session){
        if(session.getAttribute("email")!=null){
            String email = String.valueOf(session.getAttribute("email"));
            return ms.havingBalance(email);
        }
        return null;
    }

    @GetMapping("/moneyBalance")
    public @ResponseBody int moneyBalance(HttpSession session){
        if(session.getAttribute("email")!=null){
            String email = String.valueOf(session.getAttribute("email"));
            return ms.moneyBalance(email);
        }
        return 0;
    }

}


