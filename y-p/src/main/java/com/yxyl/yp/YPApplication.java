package com.yxyl.yp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yxyl.yp.mapper")
public class YPApplication {

    public static void main(String[] args) {
        SpringApplication.run(YPApplication.class, args);
    }

}
