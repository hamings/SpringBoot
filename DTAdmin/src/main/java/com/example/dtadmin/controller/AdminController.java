package com.example.dtadmin.controller;

import com.example.dtadmin.service.AdminService;
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
public class AdminController {

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

    @GetMapping("/selectCntMember")
    public @ResponseBody int selectCntMember(HttpSession session){
        if(session.getAttribute("id")!=null){
            return service.selectCntMember();
        }
        return 0;
    }
    @GetMapping("/selectAmountPayment")
    public @ResponseBody double selectAmountPayment(HttpSession session){
       if(session.getAttribute("id")!=null){
           return service.selectAmountPayment();
       }
       return 0;
    }

    @GetMapping("/selectCntBuy")
    public @ResponseBody int selectCntBuy(HttpSession session){
        if(session.getAttribute("id")!=null){
            return service.selectCntBuy();
        }
        return 0;
    }

    @GetMapping("/selectCntContact")
    public @ResponseBody int selectCntContact(HttpSession session){
        if(session.getAttribute("id")!=null){
            return service.selectCntContact();
        }
        return 0;
    }


    @GetMapping("/selectMember")
    public @ResponseBody ArrayList<HashMap<String,Object>> memberList(HttpSession session){
        if(session.getAttribute("id")!=null){
            return service.selectMember();
        }
        return null;
    }

    @GetMapping("/selectPayment")
    public @ResponseBody ArrayList<HashMap<String,Object>> paymentList(HttpSession session){
        if(session.getAttribute("id")!=null){
            return service.selectPayment();
        }
        return null;
    }

    @GetMapping("/selectBuy")
    public @ResponseBody ArrayList<HashMap<String,Object>> selectBuy(HttpSession session){
        if(session.getAttribute("id")!=null){
            return service.selectBuy();
        }
        return null;

    }
    @GetMapping("/selectContact")
    public @ResponseBody ArrayList<HashMap<String,Object>> contactList(HttpSession session){
        if(session.getAttribute("id")!=null){
            return service.selectContact();
        }
        return null;
    }

    @GetMapping("/selectSubscribe")
    public @ResponseBody ArrayList<HashMap<String,Object>> subscribeList(HttpSession session){
        if(session.getAttribute("id")!=null){
            return service.selectSubscribe();
        }
        return null;

    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }


}
