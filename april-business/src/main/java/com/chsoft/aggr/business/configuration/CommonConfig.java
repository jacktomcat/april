package com.chsoft.aggr.business.configuration;

import com.chsoft.aggr.common.CommonService;
import org.springframework.beans.factory.annotation.Qualifier;
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
@ImportResource("classpath:spring-common.xml")
public class CommonConfig {

    @Bean("tokenService")
    public Token token() {
        return new Token();
    }

}
