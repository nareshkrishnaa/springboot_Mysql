package com.nk.springboot_Mysql.InterfacePkg;

public class Traveller {
    private Vehicle vehicle;

    public Traveller(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void start(){
        this.vehicle.move();
    }
}
