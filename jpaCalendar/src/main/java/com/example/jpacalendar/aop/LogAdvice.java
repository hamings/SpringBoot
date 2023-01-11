package com.example.jpacalendar.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogAdvice {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* com.example.jpacalendar.controller..*Controller.*(..))||" +
            "execution(* com.example.jpacalendar.service..*Service*.*(..))||" +
            "execution(* com.example.jpacalendar.repository..*Repository.*(..))")
    public Object logAdvice(ProceedingJoinPoint joinPoint) throws Throwable {

        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        String parameters = Arrays.toString(joinPoint.getArgs());

        logger.info("==============[[START]]==================");
        logger.info(""+className+""+methodName+"() CALLED");
        logger.info("parameters: "+parameters);
        logger.info("===============[[END]]===================");
        return joinPoint.proceed();

    }

}
