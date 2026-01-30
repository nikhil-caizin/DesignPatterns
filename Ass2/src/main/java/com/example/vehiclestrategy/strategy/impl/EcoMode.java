package com.example.vehiclestrategy.strategy.impl;

import com.example.vehiclestrategy.strategy.MoveStrategy;

public class EcoMode implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Moving in ECO mode: smooth acceleration, energy efficient");
    }
}
