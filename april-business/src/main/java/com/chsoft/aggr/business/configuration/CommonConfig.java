package com.chsoft.aggr.business.configuration;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2018-08-14 下午11:11
 */

@Configuration
@EnableApolloConfig
@ImportResource("classpath:spring-common.xml")
public class CommonConfig {

    @Bean("tokenService")
    public Token token() {
        return new Token();
    }

}
