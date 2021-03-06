package com.chsoft.aggr.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2018-08-12 下午4:17
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GatewayBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(GatewayBootstrap.class, args);
    }

}
