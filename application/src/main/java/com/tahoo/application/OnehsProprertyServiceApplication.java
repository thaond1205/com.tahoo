package com.tahoo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"vn.onehs.*"})
public class OnehsProprertyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnehsProprertyServiceApplication.class, args);
    }

}
