package com.github.fd.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author mq
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class FdZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(FdZuulApplication.class, args);
    }
}
