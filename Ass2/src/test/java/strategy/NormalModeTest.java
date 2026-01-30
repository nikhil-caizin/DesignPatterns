package strategy;

import com.example.vehiclestrategy.strategy.impl.NormalMode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class NormalModeTest {

    @Test
    void engineMoveShouldExecuteWithoutError() {
        NormalMode normalMode = new NormalMode();
        assertDoesNotThrow(normalMode::move);
    }
}
