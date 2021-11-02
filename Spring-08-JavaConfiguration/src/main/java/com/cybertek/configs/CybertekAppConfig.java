package com.cybertek.configs;

import com.cybertek.services.Java;
import com.cybertek.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cybertek")
public class CybertekAppConfig {

    // çok kullanılmıyor...third party class larda kullanılmış..Method level annotation
    @Bean
    public Selenium selenium(){
        return new Selenium();
    }
}
