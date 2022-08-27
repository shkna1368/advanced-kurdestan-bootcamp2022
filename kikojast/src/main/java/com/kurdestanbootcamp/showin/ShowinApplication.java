package com.kurdestanbootcamp.showin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ShowinApplication {


    public static void main(String[] args) {

        SpringApplication.run(ShowinApplication.class);

    }

}
