package com.zl.wozu_report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WozuReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(WozuReportApplication.class, args);
    }

}
