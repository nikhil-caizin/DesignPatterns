package com.example.vehiclestrategy.model;

import com.example.vehiclestrategy.fuel.impl.PetrolFuel;
import com.example.vehiclestrategy.strategy.impl.EcoMode;
import com.example.vehiclestrategy.strategy.impl.SportMode;

public class Bike extends Vehicle {

    public Bike() {
        this.fuelTypeStrategy = new PetrolFuel();
        this.moveStrategy = new EcoMode();
    }

    @Override
    public void display() {
        System.out.println("I am a Bike");
    }
}
