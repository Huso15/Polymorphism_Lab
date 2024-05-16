import java.util.ArrayList;
import java.util.Collection;

public class Garage {
    private final Collection<Vehicle> vehicles;

    public Garage() {
        this.vehicles = new ArrayList<>();
    }

    public Garage(Collection<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public Collection<Vehicle> getVehicles() {
        return vehicles;
    }
}