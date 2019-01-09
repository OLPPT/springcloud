package com.ou.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class ServiceHiApplication {
    @Value("${server.port}")
    private String port;
    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }
    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name",defaultValue = "home") String name){
        return "hi,"+name+"port:"+port;
    }
}

