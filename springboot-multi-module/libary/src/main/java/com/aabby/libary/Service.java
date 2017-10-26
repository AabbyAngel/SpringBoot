package com.aabby.libary;

import org.springframework.stereotype.Component;

/**
 * Created by zhanggl on 2017/10/26.
 */
@Component
public class Service {

    /**
     * A message for the service.
     */
    private String message;

    public Service(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
