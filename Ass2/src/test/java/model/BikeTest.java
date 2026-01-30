package model;

import com.example.vehiclestrategy.model.Bike;
import com.example.vehiclestrategy.model.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BikeTest {

    @Test
    void bikeShouldHaveMoveStrategy() {
        Vehicle bike = new Bike();
        assertNotNull(bike);
        assertDoesNotThrow(bike::performMove);
    }
}
