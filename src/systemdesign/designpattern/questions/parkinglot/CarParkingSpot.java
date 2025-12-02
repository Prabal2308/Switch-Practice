package systemdesign.designpattern.questions.parkinglot;

public class CarParkingSpot extends  ParkingSpot {
    public CarParkingSpot(int spotId, ParkingFeeStrategy parkingFeeStrategy) {
        super(spotId);
    }

    @Override
    public boolean canPark(Vehicle vehicle) {
        return vehicle.getVehicleType().equalsIgnoreCase("car");
    }
}
