package com.qfedu.ams;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qfedu.ams.dao")
public class AmsApplication {

    public static void main(String[] args) {

        SpringApplication.run(AmsApplication.class, args);
    }

}
