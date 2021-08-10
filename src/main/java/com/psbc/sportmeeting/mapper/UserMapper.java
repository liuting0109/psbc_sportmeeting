package com.psbc.sportmeeting.mapper;

import com.psbc.sportmeeting.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: liuting
 * @Date: 2021/8/10 09:48
 * @Description:
 */
public interface UserMapper {
    User findByName(@Param("name") String name);

    int insert(String name, Integer sex);
}
