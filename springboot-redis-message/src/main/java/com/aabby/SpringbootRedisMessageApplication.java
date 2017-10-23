package com.aabby;

import com.aabby.config.WebCofig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.swing.*;

@SpringBootApplication
public class SpringbootRedisMessageApplication {

	private static final Logger logger = LoggerFactory.getLogger(WebCofig.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootRedisMessageApplication.class,args);
		StringRedisTemplate template = ctx.getBean(StringRedisTemplate.class);
		logger.info("Sending message...");
		template.convertAndSend("chat","Hello Message Redis!");
		System.exit(0);
	}
}
