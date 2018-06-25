package com.example.bootmybatis2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.example.bootmybatis2.dao.HappinessDao")
public class BootMybatis2Application {

    public static void main(String[] args) {
        SpringApplication.run(BootMybatis2Application.class, args);
    }
}
