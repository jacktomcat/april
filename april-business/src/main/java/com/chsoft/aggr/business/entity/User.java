package com.chsoft.aggr.business.entity;

import lombok.Data;

/**
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2018-08-14 下午10:37
 */
@Data
public class User {

    private  int id;
    private String userName;
    private String password;
    private String email;
    private String mobile;

}
