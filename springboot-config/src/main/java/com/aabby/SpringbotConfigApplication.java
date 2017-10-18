package com.aabby;

import com.aabby.config.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
public class SpringbotConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbotConfigApplication.class, args);
    }
}
