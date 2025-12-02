package systemdesign.designpattern.questions.parkinglot;

public class VehicleFactory {

    private VehicleFactory() {
        // private constructor to prevent instantiation
    }

    public static Vehicle createVehicle(String vehicleType, String licensePlate, ParkingFeeStrategy parkingFeeStrategy) {
        return switch (vehicleType.toLowerCase()) {
            case "car" -> new CarVehicle(licensePlate, parkingFeeStrategy);
            case "bike" -> new BikeVehicle(licensePlate, parkingFeeStrategy);
            default -> new OtherVehicle(licensePlate, parkingFeeStrategy);
        };
    }
}
