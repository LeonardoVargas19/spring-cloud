package com.linkedin.learning.leoromeroconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LeoromeroConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeoromeroConfigServerApplication.class, args);
    }

}
