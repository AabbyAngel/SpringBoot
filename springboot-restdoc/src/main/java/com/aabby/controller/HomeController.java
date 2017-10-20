package com.aabby.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * Created by zhanggl on 2017/10/19.
 */
@RestController
public class HomeController {


    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Map<String, String> greeting() {
        return Collections.singletonMap("message", "Hello world");
    }
}
