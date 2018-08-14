package com.chsoft.aggr.business.controller;

import com.chsoft.aggr.business.entity.User;
import com.chsoft.aggr.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("{id}")
    public User getUserList(@PathVariable("id") int id){
        return userService.getUserById(id);
    }


    @RequestMapping("list")
    public Object getUserList(){
        Map<String,String> data = new HashMap<>();
        return data;
    }

}
