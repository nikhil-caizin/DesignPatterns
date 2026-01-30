package strategy;


import com.example.vehiclestrategy.strategy.MoveStrategy;
import com.example.vehiclestrategy.strategy.impl.EcoMode;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EcoModeTest {

    @Test
    void shouldMoveInEcoMode() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        try {
            MoveStrategy ecoMode = new EcoMode();
            ecoMode.move();
        } finally {
            System.setOut(originalOut);
        }

        String output = out.toString();
        assertTrue(output.contains("ECO mode"));
        assertTrue(output.contains("energy efficient"));
    }
}
