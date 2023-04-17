package com.nk.springboot_Mysql.pk1;

import org.springframework.stereotype.Component;

@Component
public class PizzaNonVeg implements Pizza{
    @Override
    public String getPizza() {
        return "Non veg pizza";
    }
}
