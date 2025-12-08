package systemdesign.designpattern.questions.parkinglot;

public class OtherVehicle extends Vehicle {
    public OtherVehicle(String licensePlate, ParkingFeeStrategy parkingFeeStrategy) {
        super(licensePlate, "other", parkingFeeStrategy);
    }
}
