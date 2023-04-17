package com.nk.springboot_Mysql.pk1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class Config {

    @Bean
    public Name name(){
        return new Name("Naresh");
    }

}
