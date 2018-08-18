package com.chsoft.aggr.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2018-08-12 下午4:17
 */
@SpringBootApplication
@EnableEurekaClient
public class AuthBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(AuthBootstrap.class, args);
    }

}
