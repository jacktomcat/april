package com.chsoft.aggr.business;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * https://blog.csdn.net/xp_zyl/article/details/82111702
 *
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2018-08-12 下午4:17
 */
@SpringBootApplication
@EnableApolloConfig
@EnableEurekaClient
public class BusinessBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(BusinessBootstrap.class, args);
    }

}
