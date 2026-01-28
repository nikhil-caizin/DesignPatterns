package strategy;

import com.example.vehiclestrategy.strategy.impl.PedalMove;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class PedalMoveTest {

    @Test
    void pedalMoveShouldExecuteWithoutError() {
        PedalMove pedalMove = new PedalMove();
        assertDoesNotThrow(pedalMove::move);
    }
}
