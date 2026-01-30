package com.example.vehiclestrategy.fuel.impl;

import com.example.vehiclestrategy.fuel.FuelTypeStrategy;

public class DieselFuel implements FuelTypeStrategy {
    @Override
    public void useFuel() {
        System.out.println("Using DIESEL fuel");
    }
}
