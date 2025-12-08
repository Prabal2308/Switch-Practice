package systemdesign.designpattern.questions.parkinglot;

public class CarVehicle extends Vehicle {
    public CarVehicle(String licensePlate, ParkingFeeStrategy parkingFeeStrategy) {
        super(licensePlate, "car", parkingFeeStrategy);
    }
}
