package strategy;

import com.example.vehiclestrategy.strategy.impl.SportMode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class SportModeTest {

    @Test
    void pedalMoveShouldExecuteWithoutError() {
        SportMode sportMode = new SportMode();
        assertDoesNotThrow(sportMode::move);
    }
}
