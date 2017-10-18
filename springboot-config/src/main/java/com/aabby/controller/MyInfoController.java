package com.aabby.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhanggl on 2017/10/18.
 */
@RestController
public class MyInfoController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @RequestMapping(value = "/")
    public String myInfo() {
        return name + ":" + age;
    }
}
