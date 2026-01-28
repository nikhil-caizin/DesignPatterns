package com.example.vehiclestrategy.model;

import com.example.vehiclestrategy.strategy.impl.PedalMove;

public class Bike extends Vehicle {

    public Bike() {
        this.moveStrategy = new PedalMove();
    }

    @Override
    public void display() {
        System.out.println("I am a Bike");
    }
}
