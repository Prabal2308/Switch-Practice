package javabasics.oops.inheritance;

class Vehicle{
    Vehicle(){
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle{
    Car(){
        System.out.println("This vehicle is a car");
    }
}
public class SingleOrSimpleInheritance {

    public static void main(String[] args) {
        Car myCar = new Car();
    }
}
