package com.example.dtadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.dtadmin.mapper")
public class DtAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(DtAdminApplication.class, args);
    }

}
