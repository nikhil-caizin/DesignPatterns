package com.example.vehiclestrategy.model;

import com.example.vehiclestrategy.strategy.impl.ElectricMove;

public class ElectricScooter extends Vehicle {

    public ElectricScooter() {
        this.moveStrategy = new ElectricMove();
    }

    @Override
    public void display() {
        System.out.println("I am an Electric Scooter");
    }
}
