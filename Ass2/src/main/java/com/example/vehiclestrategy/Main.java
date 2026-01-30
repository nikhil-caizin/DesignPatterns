package com.example.vehiclestrategy;

import com.example.vehiclestrategy.model.Bike;
import com.example.vehiclestrategy.model.Car;
import com.example.vehiclestrategy.model.Bus;
import com.example.vehiclestrategy.model.Vehicle;
import com.example.vehiclestrategy.strategy.impl.SportMode;
import com.example.vehiclestrategy.observer.impl.VehicleLogger;

public class Main {

    public static void main(String[] args) {

        Vehicle bike = new Bike();
        bike.addObserver(new VehicleLogger());

        System.out.println("---------------------");
        bike.display();
        bike.move();

        System.out.println("---------------------");

        Vehicle bus = new Bus();
        bus.addObserver(new VehicleLogger());
        bus.display();
        bus.move();

        System.out.println("---------------------");

        Vehicle car = new Car();
        car.addObserver(new VehicleLogger());
        car.display();
        car.move();

        System.out.println("<<<Changing Car to Sport Mode>>>");
        car.setMoveStrategy(new SportMode());
        car.move();
    }
}
