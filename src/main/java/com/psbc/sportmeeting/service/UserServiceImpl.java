package com.psbc.sportmeeting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Auther: liuting
 * @Date: 2021/8/10 10:03
 * @Description:
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer age) {
        jdbcTemplate.update("insert into user_info(user_name,sex) values(?,?)",name,age);
    }
}
