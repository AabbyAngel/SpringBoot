package com.aabby;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootRestdocApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestdocApplication.class, args);
    }

    /**
     * SpringBoot启动时，查看加载的Bean
     *
     * @param context
     * @return
     */
//    @Bean
//    public CommandLineRunner commandLineRunner(final ApplicationContext context) {
//        return args -> {
//            String[] beanNames = context.getBeanDefinitionNames();
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//        };
//    }
}
