package com.psbc.sportmeeting.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.rmi.runtime.Log;

/**
 * @Auther: liuting
 * @Date: 2021/8/10 14:48
 * @Description:
 */

@Controller
@RequestMapping()
public class demoController {

    private static final Logger log = LoggerFactory.getLogger(demoController.class);

    @RequestMapping("demo")
    public String demo(Model model){
        log.debug("demo ok");
        model.addAttribute("msg","hi the");
        return "demo";
    }
}
