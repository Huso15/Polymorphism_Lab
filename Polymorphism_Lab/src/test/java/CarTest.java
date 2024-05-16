import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car(4, 5, Car.FuelType.Petrol, true);
    }

    @Test
    public void testFuelType() {
        assertEquals("Traveling by car with passengers", car.travel());
    }

    @Test
    public void testGearboxType() {
        car = new Car(4, 5, Car.FuelType.Petrol, false);
        assertEquals("Traveling by car with cargo", car.travel());
    }

    // You can add more test cases to cover different scenarios
}
