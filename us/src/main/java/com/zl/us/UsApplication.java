package com.zl.us;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsApplication.class, args);
    }

}
