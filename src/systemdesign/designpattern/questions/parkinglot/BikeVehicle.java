package systemdesign.designpattern.questions.parkinglot;

public class BikeVehicle extends Vehicle{
    public BikeVehicle(String licensePlate, ParkingFeeStrategy parkingFeeStrategy) {
        super(licensePlate, "bike", parkingFeeStrategy);
    }
}
