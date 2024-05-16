import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    private Vehicle vehicle;

    @BeforeEach
    public void setUp() {
        // Create a concrete subclass of Vehicle for testing
        vehicle = new Car(4, 5); // Example values for number of wheels and maximum occupancy
    }

    @Test
    public void testGetNumberOfWheels() {
        assertEquals(4, vehicle.getNumberOfWheels(), "Number of wheels should be 4");
    }

    @Test
    public void testGetMaximumOccupancy() {
        assertEquals(5, vehicle.getMaximumOccupancy(), "Maximum occupancy should be 5");
    }


    private static class Car extends Vehicle {
        public Car(int numberOfWheels, int maximumOccupancy) {
            super(numberOfWheels, maximumOccupancy);
        }

        @Override
        public String travel() {
            return "Travelling by car";
        }
    }
}
