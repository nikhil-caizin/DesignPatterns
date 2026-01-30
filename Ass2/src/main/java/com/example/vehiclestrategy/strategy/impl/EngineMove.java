package com.example.vehiclestrategy.strategy.impl;

import com.example.vehiclestrategy.strategy.MoveStrategy;

public class EngineMove implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Moving using an engine");
    }
}
