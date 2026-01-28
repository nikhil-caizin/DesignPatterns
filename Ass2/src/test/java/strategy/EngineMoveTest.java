package strategy;

import com.example.vehiclestrategy.strategy.impl.EngineMove;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class EngineMoveTest {

    @Test
    void engineMoveShouldExecuteWithoutError() {
        EngineMove engineMove = new EngineMove();
        assertDoesNotThrow(engineMove::move);
    }
}
