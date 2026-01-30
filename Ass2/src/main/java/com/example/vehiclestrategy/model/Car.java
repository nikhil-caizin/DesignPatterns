package com.example.vehiclestrategy.model;

import com.example.vehiclestrategy.strategy.impl.EngineMove;

public class Car extends Vehicle {

    public Car() {
        this.moveStrategy = new EngineMove();
    }

    @Override
    public void display() {
        System.out.println("I am a Car");
    }
}
