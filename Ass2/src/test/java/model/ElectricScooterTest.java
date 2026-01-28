package model;

import com.example.vehiclestrategy.model.ElectricScooter;
import com.example.vehiclestrategy.model.Vehicle;
import com.example.vehiclestrategy.strategy.impl.PedalMove;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ElectricScooterTest {

    @Test
    void scooterShouldChangeStrategyAtRuntime() {
        Vehicle scooter = new ElectricScooter();

        assertDoesNotThrow(scooter::performMove);

        scooter.setMoveStrategy(new PedalMove());
        assertDoesNotThrow(scooter::performMove);
    }
}

