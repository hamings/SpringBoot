package com.example.dtadmin.controller;

import com.example.dtadmin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class AdminController {

    @Autowired
    AdminService service;


    @GetMapping("/selectCntMember")
    public @ResponseBody int selectCntMember(HttpSession session){
            return service.selectCntMember();
        }

    @GetMapping("/selectAmountPayment")
    public @ResponseBody double selectAmountPayment(HttpSession session){
           return service.selectAmountPayment();
    }

    @GetMapping("/selectCntBuy")
    public @ResponseBody int selectCntBuy(HttpSession session){
            return service.selectCntBuy();
    }

    @GetMapping("/selectCntContact")
    public @ResponseBody int selectCntContact(HttpSession session){
            return service.selectCntContact();
    }


    @GetMapping("/selectMember")
    public @ResponseBody ArrayList<HashMap<String,Object>> memberList(HttpSession session){
            return service.selectMember();
    }

    @GetMapping("/selectPayment")
    public @ResponseBody ArrayList<HashMap<String,Object>> paymentList(HttpSession session){
            return service.selectPayment();
    }

    @GetMapping("/selectBuy")
    public @ResponseBody ArrayList<HashMap<String,Object>> selectBuy(HttpSession session){
            return service.selectBuy();
    }

    @GetMapping("/selectContact")
    public @ResponseBody ArrayList<HashMap<String,Object>> contactList(HttpSession session){
            return service.selectContact();
    }

    @GetMapping("/selectSubscribe")
    public @ResponseBody ArrayList<HashMap<String,Object>> subscribeList(HttpSession session){
            return service.selectSubscribe();
    }


}
