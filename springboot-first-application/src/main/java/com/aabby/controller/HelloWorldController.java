package com.aabby.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhanggl on 2017/10/18.
 */
@RestController
public class HelloWorldController {

    /**
     * 返回字符串Greeting from Spring boot !
     *
     * @return
     */
    @RequestMapping(value = "/")
    public String index() {
        return "Greetings from Spring boot !";
    }
}
