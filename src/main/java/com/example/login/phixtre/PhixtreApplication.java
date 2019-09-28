package com.example.login.phixtre;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.example.login.phixtre.mapper")
@EnableTransactionManagement
public class PhixtreApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhixtreApplication.class, args);
    }

}
