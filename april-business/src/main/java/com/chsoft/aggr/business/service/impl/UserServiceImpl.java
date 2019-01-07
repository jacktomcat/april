package com.chsoft.aggr.business.service.impl;

import com.chsoft.aggr.business.configuration.Token;
import com.chsoft.aggr.business.dao.UserDao;
import com.chsoft.aggr.business.entity.User;
import com.chsoft.aggr.business.service.UserService;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2018-08-14 下午10:37
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Value("${http.path}")
    private String path;

    @Autowired
    private Token token;

    public User getUserById(int id) {
        System.out.println("简单方式实现：http.path====="+this.path);
        System.out.println("bean方式实现：token====="+this.token.getId()+","+this.token.getName());
        return userDao.getUserById(id);
    }



}
