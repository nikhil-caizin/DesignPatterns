import duck.Duck;
import duck.MallardDuck;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MallardDuckTest {

    @Test
    void shouldFlyWithWings() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        Duck mallard = new MallardDuck();
        mallard.performFly();

        System.setOut(originalOut);
        assertTrue(out.toString().contains("flying with wings"));
    }

    @Test
    void shouldQuackNormally() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        Duck mallard = new MallardDuck();
        mallard.performQuack();

        System.setOut(originalOut);
        assertTrue(out.toString().contains("Quack"));
    }

    @Test
    void shouldSwimSuccessfully() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        Duck mallard = new MallardDuck();
        mallard.swim();

        System.setOut(originalOut);
        assertTrue(out.toString().contains("float"));
    }
}
