package com.chsoft.aggr.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2018-08-12 下午4:14
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBootstrap.class);
    }
}
