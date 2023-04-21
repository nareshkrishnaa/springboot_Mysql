package com.nk.springboot_Mysql.InterfacePkg;

public class Main1 {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        Traveller traveller1 = new Traveller(v);

        traveller1.start();
    }


}
