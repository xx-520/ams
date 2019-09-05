package com.qfedu.ams;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.qfedu.ams.dao")
@ServletComponentScan
public class AmsApplication {

    public static void main(String[] args) {

        SpringApplication.run(AmsApplication.class, args);
    }

}
