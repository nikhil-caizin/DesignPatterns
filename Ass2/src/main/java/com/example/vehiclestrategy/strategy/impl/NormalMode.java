package com.example.vehiclestrategy.strategy.impl;

import com.example.vehiclestrategy.strategy.MoveStrategy;

public class NormalMode implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Moving in NORMAL mode: balanced performance");
    }
}
