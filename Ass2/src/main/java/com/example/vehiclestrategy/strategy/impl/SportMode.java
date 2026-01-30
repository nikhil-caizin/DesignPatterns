package com.example.vehiclestrategy.strategy.impl;

import com.example.vehiclestrategy.strategy.MoveStrategy;

public class SportMode implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Moving in SPORT mode: aggressive acceleration, high performance");
    }
}
