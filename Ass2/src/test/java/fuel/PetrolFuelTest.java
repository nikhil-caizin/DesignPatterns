package fuel;

import com.example.vehiclestrategy.fuel.FuelTypeStrategy;
import com.example.vehiclestrategy.fuel.impl.PetrolFuel;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PetrolFuelTest {

    @Test
    void shouldUsePetrolFuel() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        try {
            FuelTypeStrategy petrolFuel = new PetrolFuel();
            petrolFuel.useFuel();
        } finally {
            System.setOut(originalOut);
        }

        String output = out.toString();
        assertTrue(output.contains("PETROL"));
    }
}
