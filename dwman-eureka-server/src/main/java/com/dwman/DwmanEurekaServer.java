package com.dwman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DwmanEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(DwmanEurekaServer.class,args);
    }
}
