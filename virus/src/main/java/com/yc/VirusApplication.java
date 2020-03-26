package com.yc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.yc.mapper")
@EnableScheduling
public class VirusApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirusApplication.class, args);
    }

}
