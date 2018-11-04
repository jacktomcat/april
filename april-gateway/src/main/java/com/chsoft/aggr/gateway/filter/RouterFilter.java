package com.chsoft.aggr.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2018-08-19 下午10:48
 */
public class RouterFilter extends ZuulFilter {


    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
