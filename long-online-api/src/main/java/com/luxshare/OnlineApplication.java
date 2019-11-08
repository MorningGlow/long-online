package com.luxshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 电商项目
 *
 * @author lion hua
 * @since 2019-11-06
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.luxshare.mapper"})
public class OnlineApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlineApplication.class, args);
    }
}
