package com.aabby;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringbootFirstApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFirstApplication.class, args);
    }

    /**
     * 打印Spring boot 帮我们注入的Bean
     * @param context
     * @return
     */
//    @Bean
//    public CommandLineRunner commandLineRunner(final ApplicationContext context) {
//        return args -> {
//            System.out.println("Let's inspect the beans provided by Spring boot:");
//            String[] beanNames = context.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//        };
//    }

}
