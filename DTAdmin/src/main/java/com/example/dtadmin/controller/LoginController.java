package com.example.dtadmin.controller;

import com.example.dtadmin.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Api(tags = {"로그인서비스"}, description = "관리자 로그인 서비스")
@Controller
public class LoginController {

    @Autowired
    AdminService service;

    @ApiOperation(value = "사용자별 인증 정보 CHECK", notes = "인증된 사용자인지 판단하는 API입니다.")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "사용자 식별 ID", required = true),
            @ApiImplicitParam(name = "password", value = "사용자 비밀번호", required = true)
    })
    @PostMapping("/login")
    public String login(@RequestParam HashMap<String,Object> params, @ApiIgnore HttpSession session){
        if(service.selectAdmin(params)==null){
            return "redirect:/";
        }
        session.setAttribute("id",params.get("id"));
        return "index";
    }

    @ApiOperation(value = "로그아웃", notes = "로그아웃 후 로그인페이지로 화면전환한다")
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }

}
