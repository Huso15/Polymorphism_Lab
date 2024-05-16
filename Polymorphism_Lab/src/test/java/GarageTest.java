import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class GarageTest {

    @Test
    public void testAddVehicle_() {
        Garage collection = new Garage();
        assertEquals(0, collection.getVehicles().size());
    }

    @Test
    public void testRemoveVehicle_EmptyCollection() {
        Garage collection = new Garage();
        assertEquals(0, collection.getVehicles().size());
    }

    @Test
    public void testGetVehicles_EmptyCollection() {
        Garage collection = new Garage();
        assertEquals(0, collection.getVehicles().size());
    }

    @Test
    public void testAddVehicle_EmptyCollection() {
        Garage collection = new Garage();
        assertEquals(0, collection.getVehicles().size());
    }


}