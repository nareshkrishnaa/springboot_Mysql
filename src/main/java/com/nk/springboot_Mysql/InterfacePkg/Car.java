package com.nk.springboot_Mysql.InterfacePkg;

public class Car implements Vehicle{

    @Override
    public void move(){
        System.out.println("Car started moving");
    }
}
