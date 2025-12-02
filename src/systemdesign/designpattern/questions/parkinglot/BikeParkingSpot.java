package systemdesign.designpattern.questions.parkinglot;

public class BikeParkingSpot extends ParkingSpot {
    public BikeParkingSpot(int spotId) {
        super(spotId);
    }

    @Override
    public boolean canPark(Vehicle vehicle) {
        return vehicle.getVehicleType().equalsIgnoreCase("bike");
    }
}
