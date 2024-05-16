import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }

    @Test
    public void testSetAndGetNumberOfGears() {
        int numberOfGears = 5;
        bike.setNumberOfGears(numberOfGears);
        assertEquals(numberOfGears, bike.getNumberOfGears());
    }

    @Test
    public void testSetAndGetBikeType() {
        String bikeType = "Mountain";
        bike.setBikeType(bikeType);
        assertEquals(bikeType, bike.getBikeType());
    }
}
