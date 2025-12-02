package systemdesign.designpattern.questions.parkinglot;

public class PremiumParkingFeeStrategy implements ParkingFeeStrategy {

    @Override
    public double calculateFare(String vehicleType, int durationInHours) {
        return switch (vehicleType.toLowerCase()) {
            case "car" -> durationInHours * 5.0;
            case "bicycle" -> durationInHours * 2.5;
            case "truck" -> durationInHours * 7.0;
            default -> durationInHours * 3.0;
        };
    }
}
