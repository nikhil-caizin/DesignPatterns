package model;

import com.example.vehiclestrategy.model.Bus;
import com.example.vehiclestrategy.model.Vehicle;
import com.example.vehiclestrategy.strategy.impl.SportMode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class BusTest {

    @Test
    void scooterShouldChangeStrategyAtRuntime() {
        Vehicle scooter = new Bus();

        assertDoesNotThrow(scooter::performMove);

        scooter.setMoveStrategy(new SportMode());
        assertDoesNotThrow(scooter::performMove);
    }
}

