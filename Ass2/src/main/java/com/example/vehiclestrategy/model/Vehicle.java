package com.example.vehiclestrategy.model;

import com.example.vehiclestrategy.strategy.MoveStrategy;

public abstract class Vehicle {

    protected MoveStrategy moveStrategy;

    public void performMove() {
        moveStrategy.move();
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public abstract void display();
}
