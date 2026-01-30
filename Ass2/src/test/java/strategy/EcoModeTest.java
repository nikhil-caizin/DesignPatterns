package strategy;


import com.example.vehiclestrategy.strategy.impl.EcoMode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class EcoModeTest {

    @Test
    void electricMoveShouldExecuteWithoutError() {
        EcoMode electricMove = new EcoMode();
        assertDoesNotThrow(electricMove::move);
    }
}
