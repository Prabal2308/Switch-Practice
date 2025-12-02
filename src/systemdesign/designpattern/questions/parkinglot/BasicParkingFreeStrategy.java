package systemdesign.designpattern.questions.parkinglot;

public class BasicParkingFreeStrategy implements ParkingFeeStrategy {

    @Override
    public double calculateFare(String vehicleType, int durationInHours) {
        return switch (vehicleType.toLowerCase()) {
            case "car" -> durationInHours * 2.0;
            case "bicycle" -> durationInHours * 1.0;
            case "truck" -> durationInHours * 3.0;
            default -> durationInHours * 1.5;
        };
    }
}
