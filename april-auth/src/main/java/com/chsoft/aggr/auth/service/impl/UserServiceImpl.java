package com.chsoft.aggr.auth.service.impl;

import com.chsoft.aggr.auth.dao.UserDao;
import com.chsoft.aggr.auth.entity.User;
import com.chsoft.aggr.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
