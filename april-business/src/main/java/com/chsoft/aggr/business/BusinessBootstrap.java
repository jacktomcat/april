package com.chsoft.aggr.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2018-08-12 下午4:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BusinessBootstrap {

    public static void main(String[] args) {
        //SpringApplication.run(BusinessBootstrap.class);
        new SpringApplicationBuilder().main(BusinessBootstrap.class).web(WebApplicationType.SERVLET).run(args);
    }

}
