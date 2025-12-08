package systemdesign.designpattern.abstractfactorypattern;

public class CorrectCode {

    interface Vehicle {
        void start();
        void stop();
    }

    static class Honda implements Vehicle {
        public void start() {
            System.out.println("Honda started");
        }
        public void stop() {
            System.out.println("Honda stopped");
        }
    }

    static class Yamaha implements Vehicle {
        public void start() {
            System.out.println("Yamaha started");
        }

        public void stop() {
            System.out.println("Yamaha stopped");
        }
    }

    static class Toyota implements Vehicle {
        public void start() {
            System.out.println("Toyota started");
        }
        public void stop() {
            System.out.println("Toyota stopped");
        }
    }

    interface VehicleFactory {
        Vehicle createVehicle();
    }

    static class HondaFactory implements VehicleFactory {
        public Vehicle createVehicle() {
            return new Honda();
        }
    }

    static class YamahaFactory implements VehicleFactory {
        public Vehicle createVehicle() {
            return new Yamaha();
        }
    }

    static class ToyotaFactory implements VehicleFactory {
        public Vehicle createVehicle() {
            return new Toyota();//also we can add if else for generating different type of Toyota vehicles
        }
    }

    public static void main(String[] args) {
        VehicleFactory hondaFactory = new HondaFactory();
        Vehicle honda = hondaFactory.createVehicle();
        honda.start();
        honda.stop();

        VehicleFactory yamahaFactory = new YamahaFactory();
        Vehicle yamaha = yamahaFactory.createVehicle();
        yamaha.start();
        yamaha.stop();

        VehicleFactory toyotaFactory = new ToyotaFactory();
        Vehicle toyota = toyotaFactory.createVehicle();
        toyota.start();
        toyota.stop();
    }

    //used for bigger families of related objects where object creation logic is complex


}
