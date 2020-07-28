package com.happy.home.zk.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@EnableDiscoveryClient
@SpringBootApplication
public class ZkServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkServiceApplication.class, args);
    }
}
