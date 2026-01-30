package com.example.vehiclestrategy.fuel.impl;

import com.example.vehiclestrategy.fuel.FuelTypeStrategy;

public class PetrolFuel implements FuelTypeStrategy {
    @Override
    public void useFuel() {
        System.out.println("Using PETROL fuel");
    }
}
