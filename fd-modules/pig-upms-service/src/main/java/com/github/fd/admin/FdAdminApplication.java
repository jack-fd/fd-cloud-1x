package com.github.fd.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author mq
 */
@MapperScan(basePackages = "com.github.fd.admin.mapper")
@EnableEurekaClient
@SpringBootApplication
public class FdAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(FdAdminApplication.class, args);
    }
}
