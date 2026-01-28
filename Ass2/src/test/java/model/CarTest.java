package model;

import com.example.vehiclestrategy.model.Car;
import com.example.vehiclestrategy.model.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CarTest {

    @Test
    void carShouldHaveMoveStrategy() {
        Vehicle car = new Car();
        assertNotNull(car);
        assertDoesNotThrow(car::performMove);
    }
}
