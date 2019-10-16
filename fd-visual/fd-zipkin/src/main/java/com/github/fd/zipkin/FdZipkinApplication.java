package com.github.fd.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @author mq
 */
@EnableZipkinServer
@EnableEurekaClient
@SpringBootApplication
public class FdZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(FdZipkinApplication.class, args);
    }
}
