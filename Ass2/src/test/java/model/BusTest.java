package model;

import com.example.vehiclestrategy.model.Bus;
import com.example.vehiclestrategy.model.Vehicle;
import com.example.vehiclestrategy.strategy.impl.SportMode;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BusTest {

    @Test
    void busShouldUseHydrogenAndEcoMode() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        try {
            Vehicle bus = new Bus();
            bus.move();
        } finally {
            System.setOut(originalOut);
        }

        String output = out.toString();

        assertTrue(output.contains("HYDROGEN"));
        assertTrue(output.contains("ECO mode"));
    }
}

