import duck.Duck;
import duck.RubberDuck;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RubberDuckTest {

    @Test
    void shouldNotFlyInitially() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        Duck rubber = new RubberDuck();
        rubber.performFly();

        System.setOut(originalOut);
        assertTrue(out.toString().contains("can't fly"));
    }

    @Test
    void shouldSqueakInsteadOfQuack() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        Duck rubber = new RubberDuck();
        rubber.performQuack();

        System.setOut(originalOut);
        assertTrue(out.toString().contains("Squeak"));
    }
}
