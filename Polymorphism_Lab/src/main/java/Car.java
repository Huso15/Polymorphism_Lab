public class Car extends Vehicle {

    enum FuelType {
        Petrol, Diesel, Electric, Hybrid
    }

    private final FuelType fuelType;
    private final boolean publicTravel;

    public Car(int numberOfWheels, int maximumOccupancy, FuelType fuelType, boolean publicTravel) {
        super(numberOfWheels, maximumOccupancy);
        this.fuelType = fuelType;
        this.publicTravel = publicTravel;
    }

    @Override
    public String travel() {
        String travelMessage = "Traveling by car with ";
        if (publicTravel) {
            travelMessage += "passengers";
        } else {
            travelMessage += "cargo";
        }
        return travelMessage;
    }
}