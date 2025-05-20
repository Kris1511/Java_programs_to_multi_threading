package com.example.demo;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
@PropertySource("classpath:application.properties")
public class AppConfig {

}
