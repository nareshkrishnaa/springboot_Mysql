package com.nk.springboot_Mysql.pk1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Name {
    String name;

    public Name(String name){
        this.name=name;
    }


    public String getName() {
        return name;
    }
}
