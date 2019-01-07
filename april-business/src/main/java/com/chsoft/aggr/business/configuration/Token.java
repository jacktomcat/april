package com.chsoft.aggr.business.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2018-11-04 下午8:16
 */

@ConfigurationProperties(prefix = "april.business")
@RefreshScope
@Component("token")
public class Token {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
