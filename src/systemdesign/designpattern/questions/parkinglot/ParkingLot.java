package systemdesign.designpattern.questions.parkinglot;

import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots;

    public ParkingLot(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingSpot findAvailableSpot(String vehicleType) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied() && spot.getVehicleType().equalsIgnoreCase(vehicleType)) {
                return spot;
            }
        }
        return null; // No available spot found
    }
}
