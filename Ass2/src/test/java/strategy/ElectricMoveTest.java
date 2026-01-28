package strategy;


import com.example.vehiclestrategy.strategy.impl.ElectricMove;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ElectricMoveTest {

    @Test
    void electricMoveShouldExecuteWithoutError() {
        ElectricMove electricMove = new ElectricMove();
        assertDoesNotThrow(electricMove::move);
    }
}
