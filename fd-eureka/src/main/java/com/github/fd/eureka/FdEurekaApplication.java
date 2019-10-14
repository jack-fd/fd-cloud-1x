package com.github.fd.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author mq
 */
@EnableEurekaServer
@SpringBootApplication
public class FdEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FdEurekaApplication.class, args);
    }
}
