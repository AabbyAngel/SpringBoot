package com.aabby;

import com.aabby.libary.Service;
import com.aabby.libary.ServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Import(ServiceConfiguration.class)
@SpringBootApplication
public class DemoApplication {

    private final Service service;

    @Autowired
    public DemoApplication(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return service.getMessage();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}
