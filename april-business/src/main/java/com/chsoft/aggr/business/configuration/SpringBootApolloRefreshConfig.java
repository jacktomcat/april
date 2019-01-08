package com.chsoft.aggr.business.configuration;

import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2019-01-07 下午11:08
 */

//@ConditionalOnProperty(name= {"april.business.id"})
@Component
public class SpringBootApolloRefreshConfig {

    @Autowired
    private Token token;

    @Autowired
    private RefreshScope refreshScope;


    @ApolloConfigChangeListener
    public void onChange(ConfigChangeEvent changeEvent) {
        System.out.println("==============================");
        boolean redisCacheKeysChanged = false;
        for (String changedKey : changeEvent.changedKeys()) {
            if (changedKey.startsWith("april.business")) {
                //redisCacheKeysChanged = true;
                //break;
            }
        }
        //if (!redisCacheKeysChanged) {
        //    return;
       // }

        System.out.println("before refresh "+ token.toString());
        refreshScope.refresh("token");
        refreshScope.refresh("properties");
        System.out.println("after refresh " + token.toString());
    }

}
