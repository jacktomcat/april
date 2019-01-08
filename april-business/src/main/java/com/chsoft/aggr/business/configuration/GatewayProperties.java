package com.chsoft.aggr.business.configuration;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GatewayProperties {
    /**
     * 不需要进行权限过滤的url
     */
    private List<String> notFilterUrls = new ArrayList<>();
}
