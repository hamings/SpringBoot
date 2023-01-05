package com.example.dtcoin.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Aspect
@Component
public class AuthAspect {

    @Pointcut("execution(public String com.example.dtcoin.controller.PointController.*(..))||execution(public String com.example.dtcoin.controller.CoinController.*(..))")
    public void cut(){}


    @Around("cut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{

        HttpSession session =((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();

        if(session.getAttribute("email")==null){
            return "login";
        }else{
            return joinPoint.proceed();
        }

    }

    @Pointcut("execution(public java.util.ArrayList com.example.dtcoin.controller.PointController.*(..))||" +
            "execution(public java.util.ArrayList com.example.dtcoin.controller.CoinController.*(..))||" +
            "execution(public java.util.ArrayList com.example.dtcoin.controller.MemberController.*(..))")
    public void cut2(){}


    @Around("cut2()")
    public Object around2(ProceedingJoinPoint joinPoint) throws Throwable{

        HttpSession session =((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();

        if(session.getAttribute("email")==null){
            return null;
        }else{
            return joinPoint.proceed();
        }

    }

    @Pointcut("execution(public int com.example.dtcoin.controller.MemberController.*(..))")
    public void cut3(){}


    @Around("cut2()")
    public Object around3(ProceedingJoinPoint joinPoint) throws Throwable{

        HttpSession session =((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();

        if(session.getAttribute("email")==null){
            return 0;
        }else{
            return joinPoint.proceed();
        }

    }


}
