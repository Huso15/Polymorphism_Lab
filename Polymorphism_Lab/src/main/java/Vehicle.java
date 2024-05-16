public abstract class Vehicle {

    enum FuelType {
        PETROL, DIESEL, ELECTRIC, HYBRID
    }

    private final int numberOfWheels;
    private final int maximumOccupancy;

    public Vehicle(int numberOfWheels, int maximumOccupancy) {
        this.numberOfWheels = numberOfWheels;
        this.maximumOccupancy = maximumOccupancy;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getMaximumOccupancy() {
        return maximumOccupancy;
    }

    public abstract String travel();
}