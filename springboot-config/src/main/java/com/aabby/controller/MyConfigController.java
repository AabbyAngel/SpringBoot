package com.aabby.controller;

import com.aabby.config.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhanggl on 2017/10/18.
 */
@RestController
public class MyConfigController {

    @Autowired
    private ConfigBean configBean;

    @RequestMapping(value = "/my")
    public String myInfo() {
        return configBean.getGreeting() + " " +
                ">>>>" + configBean.getName() +
                ">>>>" + configBean.getUuid() +
                ">>>>" + configBean.getMax() +
                ">>>>" + configBean.getValue() +
                ">>>>" + configBean.getAge();
    }
}
