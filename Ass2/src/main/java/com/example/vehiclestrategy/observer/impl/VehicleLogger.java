package com.example.vehiclestrategy.observer.impl;

import com.example.vehiclestrategy.model.Vehicle;
import com.example.vehiclestrategy.observer.VehicleObserver;

public class VehicleLogger implements VehicleObserver {

    @Override
    public void update(Vehicle vehicle) {
        System.out.println(
                "LOGGER: " + vehicle.getClass().getSimpleName() + " moved"
        );
    }
}

