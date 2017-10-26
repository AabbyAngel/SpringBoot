package com.aabby.libary;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by zhanggl on 2017/10/26.
 */
@ConfigurationProperties("service")
public class ServiceProperties {

    /**
     * A message for the service.
     */
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
