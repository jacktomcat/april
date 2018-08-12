package com.chsoft.aggr.business.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2018-08-12 下午8:59
 */
@RestController
public class UserController {

    @RequestMapping("list")
    public Object getUserList(){
        Map<String,String> data = new HashMap<>();
        return data;
    }

}
