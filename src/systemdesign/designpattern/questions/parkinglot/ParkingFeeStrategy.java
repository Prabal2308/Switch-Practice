package systemdesign.designpattern.questions.parkinglot;

public interface ParkingFeeStrategy {

    double calculateFare(String vehicleType, int durationInHours);
}
