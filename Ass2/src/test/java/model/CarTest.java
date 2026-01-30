package model;

import com.example.vehiclestrategy.model.Car;
import com.example.vehiclestrategy.model.Vehicle;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void carShouldUsePetrolAndNormalMode() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        try {
            Vehicle car = new Car();
            car.move();
        } finally {
            System.setOut(originalOut);
        }

        String output = out.toString();

        assertTrue(output.contains("PETROL"));
        assertTrue(output.contains("NORMAL mode"));
    }
}
