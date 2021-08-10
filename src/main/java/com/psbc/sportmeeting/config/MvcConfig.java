package com.psbc.sportmeeting.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

/**
 * @Auther: liuting
 * @Date: 2021/8/10 15:42
 * @Description:
 */

@Configuration
public class MvcConfig implements WebMvcConfigurer{

    @Override
    //ViewController请求路径   viewname:跳转视图
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("submit").setViewName("submit");
        //WebMvcConfigurer.super.addViewControllers(registry);
    }
}
