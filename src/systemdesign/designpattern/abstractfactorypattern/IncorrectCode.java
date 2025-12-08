package systemdesign.designpattern.abstractfactorypattern;

//if object creation logic is getting complex and we have different types of vehicles like Car, Bike, Bus for each brand
//create abstract factory pattern to handle this complexity, for each brand we will have a factory class that will create different types of vehicles
public class IncorrectCode {

    interface Vehicle{
        void start();
        void stop();
    }

    static class Toyota implements Vehicle{
        public void start(){
            System.out.println("Toyota started");
        }
        public void stop(){
            System.out.println("Toyota stopped");
        }
    }

    static class BMW implements Vehicle{
        public void start(){
            System.out.println("BMW started");
        }
        public void stop() {
            System.out.println("BMW stopped");
        }
    }

    static class Honda implements Vehicle{
        public void start(){
            System.out.println("Honda started");
        }
        public void stop(){
            System.out.println("Honda stopped");
        }
    }

    static class VehicleFactory{
        public static Vehicle createVehicle(String brand){
            if(brand.equals("Toyota")){
                return new Toyota();
            } else if(brand.equals("BMW")){
                return new BMW();
            } else if(brand.equals("Honda")){
                return new Honda();
            } else{
                throw new IllegalArgumentException("Invalid Vehicle brand");
            }
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.createVehicle("Toyota");
        vehicle.start();
        vehicle.stop();

        Vehicle vehicle1 = VehicleFactory.createVehicle("BMW");
        vehicle1.start();
        vehicle1.stop();

        Vehicle vehicle2 = VehicleFactory.createVehicle("Honda");
        vehicle2.start();
        vehicle2.stop();

        //Now lets saying the object creation logic is getting complex and we have different types of vehicles like Car, Bike, Bus for each brand
    }
}
