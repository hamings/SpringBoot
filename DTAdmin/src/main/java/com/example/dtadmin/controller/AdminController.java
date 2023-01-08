package com.example.dtadmin.controller;

import com.example.dtadmin.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

@Api(tags = {"관리자서비스"}, description = "관리자 관련 서비스")
@RestController
public class AdminController {

    @Autowired
    AdminService service;


    @ApiOperation(value = "총 고객수", notes = "총 고객수를 조회한다")
    @GetMapping("/selectCntMember")
    public @ResponseBody int selectCntMember(HttpSession session){
            return service.selectCntMember();
        }

    @ApiOperation(value = "총 포인트 판매량", notes = "총 포인트 판매량을 조회한다")
    @GetMapping("/selectAmountPayment")
    public @ResponseBody double selectAmountPayment(HttpSession session){
           return service.selectAmountPayment();
    }

    @ApiOperation(value = "총 구매수", notes = "총 구매수를 조회한다")
    @GetMapping("/selectCntBuy")
    public @ResponseBody int selectCntBuy(HttpSession session){
            return service.selectCntBuy();
    }

    @ApiOperation(value = "총 연락요청 건수", notes = "총 연락요청 건수를 조회한다")
    @GetMapping("/selectCntContact")
    public @ResponseBody int selectCntContact(HttpSession session){
            return service.selectCntContact();
    }


    @ApiOperation(value = "고객정보", notes = "고객정보를 조회한다")
    @GetMapping("/selectMember")
    public @ResponseBody ArrayList<HashMap<String,Object>> memberList(HttpSession session){
            return service.selectMember();
    }

    @ApiOperation(value = "포인트 판매정보", notes = "포인트 판매정보를 조회한다")
    @GetMapping("/selectPayment")
    public @ResponseBody ArrayList<HashMap<String,Object>> paymentList(HttpSession session){
            return service.selectPayment();
    }

    @ApiOperation(value = "구매정보", notes = "구매정보를 조회한다")
    @GetMapping("/selectBuy")
    public @ResponseBody ArrayList<HashMap<String,Object>> selectBuy(HttpSession session){
            return service.selectBuy();
    }

    @ApiOperation(value = "연락요청 정보", notes = "연락요청 정보를 조회한다")
    @GetMapping("/selectContact")
    public @ResponseBody ArrayList<HashMap<String,Object>> contactList(HttpSession session){
            return service.selectContact();
    }

    @ApiOperation(value = "구독요청 정보", notes = "구독요청 정보를 조회한다")
    @GetMapping("/selectSubscribe")
    public @ResponseBody ArrayList<HashMap<String,Object>> subscribeList(HttpSession session){
            return service.selectSubscribe();
    }


}
