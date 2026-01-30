package fuel;

import com.example.vehiclestrategy.fuel.FuelTypeStrategy;
import com.example.vehiclestrategy.fuel.impl.DieselFuel;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DieselFuelTest {

    @Test
    void shouldUseDieselFuel() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        try {
            FuelTypeStrategy dieselFuel = new DieselFuel();
            dieselFuel.useFuel();
        } finally {
            System.setOut(originalOut);
        }

        String output = out.toString();
        assertTrue(output.contains("DIESEL"));
    }
}

