package systemdesign.designpattern.factorypattern;

//say object creation should be done in a centralized place/factory
public class IncorrectCode {
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

    public static void main(String[] args) {
        Vehicle vehicle = new Car(); // Direct instantiation
        vehicle.start();
        vehicle.stop();

        Vehicle vehicle1 = new Bike();
        vehicle1.start();
        vehicle1.stop();

        Vehicle vehicle2 = new Bus();
        vehicle2.start();
        vehicle2.stop();

        String vehicleType = "Car";
        Vehicle vehicle3;
        if(vehicleType.equals("Car")){
            vehicle3 = new Car();
        } else if(vehicleType.equals("Bike")){
            vehicle3 = new Bike();
        } else if(vehicleType.equals("Bus")){
            vehicle3 = new Bus();
        } else{
            throw new IllegalArgumentException("Invalid Vehicle type");
        } //this is also require changes if logic of existing vehicle changes or new vehicle is added, everywhere any Vehicle is created

        //we are creating a variety as user by ourselves manually, and same would be done by other users at other places
        //this is incorrect as it violates the factory pattern design principle
    }

    //what if logic of existing vehicle changes or new vehicle is added?
}
