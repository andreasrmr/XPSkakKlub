package com.dat18c.xpskakklub;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Configuration
public class MvcConfig {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/employees/create").setViewName("create");
        registry.addViewController("/login").setViewName("login");
    }
}
