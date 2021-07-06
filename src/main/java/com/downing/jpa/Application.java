package com.downing.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.downing.*")
@EnableJpaRepositories("com.downing.jpa.**")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
