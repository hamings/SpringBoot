package com.example.dtcoin.controller;

import com.example.dtcoin.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class CoinController {

    @Autowired
    CoinService cs;

    @PostMapping("/buyCoin")
    public String insertBuy(@RequestParam HashMap<String,Object> params, HttpSession session){
        if(session.getAttribute("email")!=null){
            String email = String.valueOf(session.getAttribute("email"));
            params.put("email",email);
            cs.insertBuy(params);
            return "success";
        }
        return "failed";
    }

    @GetMapping("/buyList")
    public ArrayList<HashMap<String,Object>> buyList(HttpSession session){
        if(session.getAttribute("email")!=null){
            String email = String.valueOf(session.getAttribute("email"));
            return cs.selectBuy(email);
        }
        return null;
    }

}
