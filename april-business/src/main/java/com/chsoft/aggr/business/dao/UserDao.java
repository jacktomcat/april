package com.chsoft.aggr.business.dao;

import com.chsoft.aggr.business.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2018-08-14 下午10:46
 */

@Mapper
public interface UserDao {

    User getUserById(int id);


}
