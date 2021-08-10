package com.psbc.sportmeeting.entity;

import lombok.Data;
import lombok.NoArgsConstructor;//空参构造器

/**
 * @Auther: liuting
 * @Date: 2021/8/10 09:41
 * @Description:
 */

@Data
@NoArgsConstructor//生成空参数的构造器

public class User {

    private Long user_id;//不用传
    private String user_name;
    private Integer sex;//0,1
    private String tel;
    private String skill;
    private Integer group_id;
    private String avatar;//头像存放地址

    public User(String user_name, Integer sex) {
        this.user_name = user_name;
        this.sex = sex;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
