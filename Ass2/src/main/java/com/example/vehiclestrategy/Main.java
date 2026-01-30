package com.example.vehiclestrategy;

import com.example.vehiclestrategy.model.Bike;
import com.example.vehiclestrategy.model.Car;
import com.example.vehiclestrategy.model.ElectricScooter;
import com.example.vehiclestrategy.model.Vehicle;
import com.example.vehiclestrategy.strategy.impl.PedalMove;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car();
        car.display();
        car.performMove();

        System.out.println();

        Vehicle bike = new Bike();
        bike.display();
        bike.performMove();

        System.out.println();

        Vehicle scooter = new ElectricScooter();
        scooter.display();
        scooter.performMove();

        // Runtime behavior change
        System.out.println("\nBattery dead! Switching strategy...");
        scooter.setMoveStrategy(new PedalMove());
        scooter.performMove();
    }

}
