package com.example.dtcoin.controller;

import com.example.dtcoin.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class PointController {

    @Autowired
    PointService ps;

    @GetMapping("/point")
    public String insertPoint(@RequestParam HashMap<String,Object> point, HttpSession session){
            String email = String.valueOf(session.getAttribute("email"));
            point.put("email",email);
            ps.insertPoint(point);
            return "충전 성공했습니다.";
    }

    @GetMapping("/pointList")
    public ArrayList<HashMap<String,Object>> pointList(HttpSession session){
            String email = String.valueOf(session.getAttribute("email"));
            return ps.selectPoint(email);
    }

    @GetMapping("/checkBalance")
    public String checkBalance(HttpSession session, String total){
            String email = String.valueOf(session.getAttribute("email"));
            double balance = ps.checkBalance(email);
            double totalAmount = Double.valueOf(total);

            if((balance-totalAmount)>0){
                return "can";
            }else{
                return "cannot";
            }
        }

}





