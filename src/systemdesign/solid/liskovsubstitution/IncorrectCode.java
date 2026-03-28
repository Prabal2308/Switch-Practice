package systemdesign.solid.liskovsubstitution;

//says that a subclass should be substitutable for its superclass without affecting the correctness of the program(seamlessly).
public class IncorrectCode {
    static class Vehicle {
        void startEngine() {
            System.out.println("Engine started");
        }
    }

    static class Bike extends Vehicle {
        @Override
        void startEngine() {
            System.out.println("Bike engine started");
        }
    }

    static class Bicycle extends Vehicle {
        @Override
        void startEngine() {
            throw new UnsupportedOperationException("Bicycles do not have engines");
        }
    }

    public static void main(String[] args) {
        Vehicle myBike = new Bike();
        myBike.startEngine(); // Works fine

        Vehicle myBicycle = new Bicycle();
        myBicycle.startEngine(); // Throws exception, violating LSP, bicycle does not substitute Vehicle correctly
        //we have to handle the exception everywhere we use Bicycle as Vehicle, leading to incorrect code violating LSP
    }
    //when a subclass fails to fulfill the contract of its superclass, leads to break down of polymorphism, hence incorrect code

    //code becomes less flexible and harder to extend or maintain
}
