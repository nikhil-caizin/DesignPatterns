package com.example.vehiclestrategy.model;

import com.example.vehiclestrategy.fuel.impl.HydrogenFuel;
import com.example.vehiclestrategy.strategy.impl.EcoMode;

public class Bus extends Vehicle {

    public Bus() {
        this.fuelTypeStrategy = new HydrogenFuel();
        this.moveStrategy = new EcoMode();
    }

    @Override
    public void display() {
        System.out.println("I am a bus");
    }
}
