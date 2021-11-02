package com.cybertek.configs;

import com.cybertek.services.Java;
import com.cybertek.services.OfficeHours;
import com.cybertek.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.cybertek")
@PropertySource("classpath:application.properties")
public class CybertekAppConfig {

    // çok kullanılmıyor...third party class larda kullanılmış..Method level annotation
    @Bean
    public Selenium selenium(){
        return new Selenium(officeHours());
    }

    @Bean
    public OfficeHours officeHours(){
        return new OfficeHours();
    }
}
