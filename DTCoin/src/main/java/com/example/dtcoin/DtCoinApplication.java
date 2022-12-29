package com.example.dtcoin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value ={"com.example.dtcoin.mapper"})
@SpringBootApplication
public class DtCoinApplication {

    public static void main(String[] args) {
        SpringApplication.run(DtCoinApplication.class, args);
    }

}
