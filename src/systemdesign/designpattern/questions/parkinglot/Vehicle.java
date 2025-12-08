package systemdesign.designpattern.questions.parkinglot;

public abstract class Vehicle {
    private String licensePlate;
    private String vehicleType;

    private ParkingFeeStrategy parkingFeeStrategy;

    public Vehicle(String licensePlate, String vehicleType, ParkingFeeStrategy parkingFeeStrategy) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.parkingFeeStrategy = parkingFeeStrategy;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}
