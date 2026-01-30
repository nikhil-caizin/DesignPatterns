package com.example.vehiclestrategy.model;

import com.example.vehiclestrategy.fuel.FuelTypeStrategy;
import com.example.vehiclestrategy.strategy.MoveStrategy;

public abstract class Vehicle {

    protected FuelTypeStrategy fuelTypeStrategy;
    protected MoveStrategy moveStrategy;

    public void setFuelTypeStrategy(FuelTypeStrategy fuelTypeStrategy) {
        this.fuelTypeStrategy = fuelTypeStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void move() {
        fuelTypeStrategy.useFuel();
        moveStrategy.move();
    }

    public abstract void display();
}
