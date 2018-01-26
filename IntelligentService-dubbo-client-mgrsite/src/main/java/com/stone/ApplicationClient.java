package com.stone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author stone
 * @date 2018/1/22 10:17
 */

@SpringBootApplication
public class ApplicationClient extends SpringBootServletInitializer {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationClient.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationClient.class);
    }
}
