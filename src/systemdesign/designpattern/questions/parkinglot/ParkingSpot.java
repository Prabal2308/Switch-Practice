package systemdesign.designpattern.questions.parkinglot;

public abstract class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;
    private Vehicle parkedVehicle;
    private String vehicleType;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public abstract boolean canPark(Vehicle vehicle);

    public void parkVehicle(Vehicle vehicle) {
        if (canPark(vehicle) && !isOccupied) {
            this.parkedVehicle = vehicle;
            this.isOccupied = true;
        } else {
            throw new IllegalStateException("Cannot park vehicle here.");
        }
    }

    public void unparkVehicle(Vehicle vehicle) {
        if (isOccupied && parkedVehicle.equals(vehicle)) {
            this.parkedVehicle = null;
            this.isOccupied = false;
        } else {
            throw new IllegalStateException("No such vehicle parked here.");
        }
    }

    public int getSpotNumber() {
        return spotNumber;
    }
}
