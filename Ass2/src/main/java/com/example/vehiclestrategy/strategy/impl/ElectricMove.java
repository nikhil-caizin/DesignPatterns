package com.example.vehiclestrategy.strategy.impl;

import com.example.vehiclestrategy.strategy.MoveStrategy;

public class ElectricMove implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Moving using electric power");
    }
}
