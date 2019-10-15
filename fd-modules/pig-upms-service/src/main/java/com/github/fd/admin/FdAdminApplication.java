package com.github.fd.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author mq
 */
@MapperScan("com.github.fd.admin.mapper")
@EnableEurekaClient
@SpringBootApplication
public class FdAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(FdAdminApplication.class, args);
    }
}
