package systemdesign.designpattern.factorypattern;

public class CorrectCode {

    interface Vehicle{
        void start();
        void stop();
    }

    static class Car implements Vehicle{
        public void start(){
            System.out.println("Car started");
        }
        public void stop(){
            System.out.println("Car stopped");
        }
    }

    static class Bike implements Vehicle{
        public void start(){
            System.out.println("Bike started");
        }
        public void stop(){
            System.out.println("Bike stopped");
        }
    }

    static class Bus implements Vehicle{
        public void start(){
            System.out.println("Bus started");
        }
        public void stop(){
            System.out.println("Bus stopped");
        }
    }

    static class VehicleFactory{
        public static Vehicle createVehicle(String vehicleType){
            switch(vehicleType){
                case "Car":
                    return new Car();
                case "Bike":
                    return new Bike();
                case "Bus":
                    return new Bus();
                default:
                    throw new IllegalArgumentException("Invalid Vehicle type");
            }
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.createVehicle("Car");
        vehicle.start();
        vehicle.stop();

        Vehicle vehicle1 = VehicleFactory.createVehicle("Bike");
        vehicle1.start();
        vehicle1.stop();

        Vehicle vehicle2 = VehicleFactory.createVehicle("Bus");
        vehicle2.start();
        vehicle2.stop();
    }

    //we have centralized the object creation logic in VehicleFactory class

    //helps in encapsulating the object creation logic, scalability, maintainability

    //any changes needed in object creation logic will be done in factory class only

    //fatory pattern is creational design pattern, and is used in scenarios like managing database connections,
    // logging frameworks, etc. where a variety of objects need to be created based on specific conditions
}
