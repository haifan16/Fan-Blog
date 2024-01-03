package com.zenghaifan;

import org.mapstruct.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zenghaifan.mapper")
public class FanBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(FanBlogApplication.class, args);
    }
}
