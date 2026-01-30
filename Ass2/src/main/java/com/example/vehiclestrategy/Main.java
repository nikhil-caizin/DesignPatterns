package com.example.vehiclestrategy;

import com.example.vehiclestrategy.model.Bike;
import com.example.vehiclestrategy.model.Car;
import com.example.vehiclestrategy.model.Bus;
import com.example.vehiclestrategy.model.Vehicle;
import com.example.vehiclestrategy.strategy.impl.SportMode;

public class Main {

    public static void main(String[] args) {

        Vehicle bike = new Bike();
        System.out.println("---------------------");
        bike.display();
        bike.move();
        System.out.println("---------------------");

        Vehicle bus = new Bus();
        bus.display();
        bus.move();
        System.out.println("---------------------");

        Vehicle car = new Car();
        car.display();
        car.move();

        System.out.println("<<<Changing Car to Sport Mode>>>");
        bike.setMoveStrategy(new SportMode());
        bike.move();
    }

}
