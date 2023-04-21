package com.nk.springboot_Mysql.InterfacePkg;

public class Cycle implements Vehicle{

    @Override
    public void move() {
        System.out.println("Cycle started moving");
    }
}
