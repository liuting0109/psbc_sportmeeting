package com.psbc.sportmeeting.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: liuting
 * @Date: 2021/8/10 09:32
 * @Description:
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("/demotest")
    public String demo(){
        return "demo";
    }

    @RequestMapping("/submit")
    public String registerByUser(HttpServletRequest request){
        return "submit";
    }



    @RequestMapping("/show")
    public String getUserInfo(HttpServletRequest request){
        String name = request.getParameter("username");
        String sex = request.getParameter("sex");
        System.out.println("userName is:" + name);
        System.out.println("userPwd is:" + sex);
        return name + sex;
    }

}
