package com.example.vehiclestrategy.model;

import com.example.vehiclestrategy.fuel.impl.PetrolFuel;
import com.example.vehiclestrategy.strategy.impl.NormalMode;

public class Car extends Vehicle {

    public Car() {
        this.fuelTypeStrategy = new PetrolFuel();
        this.moveStrategy = new NormalMode();
    }

    @Override
    public void display() {
        System.out.println("I am a Car");
    }
}
