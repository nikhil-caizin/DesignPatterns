package com.example.vehiclestrategy.model;

import com.example.vehiclestrategy.fuel.FuelTypeStrategy;
import com.example.vehiclestrategy.strategy.MoveStrategy;
import com.example.vehiclestrategy.observer.VehicleObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    protected FuelTypeStrategy fuelTypeStrategy;
    protected MoveStrategy moveStrategy;

    private final List<VehicleObserver> observers = new ArrayList<>();

    public void addObserver(VehicleObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(VehicleObserver observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (VehicleObserver observer : observers) {
            observer.update(this);
        }
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void move() {
        fuelTypeStrategy.useFuel();
        moveStrategy.move();
        notifyObservers();
    }

    public abstract void display();
}
