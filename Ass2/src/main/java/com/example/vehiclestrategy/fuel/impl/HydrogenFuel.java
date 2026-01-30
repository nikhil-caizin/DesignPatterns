package com.example.vehiclestrategy.fuel.impl;

import com.example.vehiclestrategy.fuel.FuelTypeStrategy;

public class HydrogenFuel implements FuelTypeStrategy {
    @Override
    public void useFuel() {
        System.out.println("Using HYDROGEN fuel");
    }
}
