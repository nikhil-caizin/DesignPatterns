package strategy;

import com.example.vehiclestrategy.strategy.MoveStrategy;
import com.example.vehiclestrategy.strategy.impl.SportMode;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SportModeTest {

    @Test
    void shouldMoveInSportMode() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        try {
            MoveStrategy sportMode = new SportMode();
            sportMode.move();
        } finally {
            System.setOut(originalOut);
        }

        String output = out.toString();
        assertTrue(output.contains("SPORT mode"));
        assertTrue(output.contains("high performance"));
    }
}
