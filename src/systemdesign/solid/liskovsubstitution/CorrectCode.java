package systemdesign.solid.liskovsubstitution;

public class CorrectCode {
    abstract static class Vehicle{
        public void move(){
            System.out.println("Vehicle is moving");
        }
    }

    abstract static class EnginePoweredVehicle extends Vehicle{
        public abstract void startEngine();
    }

    abstract static class NonEnginePoweredVehicle extends Vehicle{
        // Non-engine powered vehicles do not have startEngine method
    }

    static class Bike extends EnginePoweredVehicle{
        @Override
        public void startEngine() {
            System.out.println("Bike engine started");
        }
    }

    static class Bicycle extends NonEnginePoweredVehicle{

        @Override
        public void move() {
            System.out.println("Bicycle is pedaled");
        }
    }

    public static void main(String[] args) {
        EnginePoweredVehicle myBike = new Bike();
        myBike.startEngine(); // Works fine
        myBike.move();

        NonEnginePoweredVehicle myBicycle = new Bicycle();
        myBicycle.move(); // Works fine, no engine to start
    }
}
