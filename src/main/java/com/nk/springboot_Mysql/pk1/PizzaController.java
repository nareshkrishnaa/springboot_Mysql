package com.nk.springboot_Mysql.pk1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {

    private Pizza pizza;

    @Autowired
    public PizzaController(@Qualifier("pizzaVeg") Pizza pizza){
        this.pizza=pizza;
    }


    public String getPizza(){
        return pizza.getPizza();
    }


}
