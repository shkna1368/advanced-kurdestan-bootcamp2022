package com.kurdestanbootcamp.khanoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class KhanooApplication {


    public static void main(String[] args) {

        SpringApplication.run(KhanooApplication.class);

    }

}
