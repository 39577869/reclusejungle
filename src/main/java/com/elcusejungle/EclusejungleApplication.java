package com.elcusejungle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.elcusejungle.mapper")
public class EclusejungleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EclusejungleApplication.class, args);
    }

}
