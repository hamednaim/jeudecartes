package com.naim.jeudecartes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JeudecarteApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(JeudecarteApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JeudecarteApplication.class);
    }
}
