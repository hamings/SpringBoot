package com.example.dtadmin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = {"페이지"}, description = "페이지 전환")
@Controller
public class PageController {

    @ApiOperation(value = "로그인", notes = "로그인 화면으로 이동")
    @GetMapping("/")
    public String gologin(){
        return "login";
    }

    @ApiOperation(value = "인덱스", notes = "로그인 후 화면")
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @ApiOperation(value = "회원목록", notes = "회원목록 화면으로 이동")
    @GetMapping("/goMember")
    public String goMember(){
        return "memberList";
    }

    @ApiOperation(value = "결제목록", notes = "결제목록 화면으로 이동")
    @GetMapping("/goPayment")
    public String goPayment(){
        return "paymentList";
    }

    @ApiOperation(value = "구매목록", notes = "구매목록 화면으로 이동")
    @GetMapping("/goBuy")
    public String goBuy(){
        return "buyList";
    }

    @ApiOperation(value = "연락요청목록", notes = "연락요청목록 화면으로 이동")
    @GetMapping("/goContact")
    public String goContact(){
        return "contactList";
    }

    @ApiOperation(value = "구독목록", notes = "구독목록 화면으로 이동")
    @GetMapping("/goSubscribe")
    public String goSubscribe(){
        return "subscribeList";
    }


}
