package com.nk.springboot_Mysql.InterfacePkg;

public class Bike implements Vehicle{

    @Override
    public void move() {
        System.out.println("Bike started moving");
    }
}
