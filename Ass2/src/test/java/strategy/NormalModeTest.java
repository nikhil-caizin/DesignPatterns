package strategy;

import com.example.vehiclestrategy.strategy.MoveStrategy;
import com.example.vehiclestrategy.strategy.impl.NormalMode;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NormalModeTest {

    @Test
    void shouldMoveInNormalMode() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        try {
            MoveStrategy normalMode = new NormalMode();
            normalMode.move();
        } finally {
            System.setOut(originalOut);
        }

        String output = out.toString();
        assertTrue(output.contains("NORMAL mode"));
        assertTrue(output.contains("balanced"));
    }
}
