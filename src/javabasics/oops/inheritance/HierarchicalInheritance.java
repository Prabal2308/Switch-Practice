package javabasics.oops.inheritance;

class Vehicle2{
    Vehicle2(){
        System.out.println("This is a Vehicle");
    }
}

class Car2 extends Vehicle2{
    Car2(){
        System.out.println("This is a Car");
    }
}

class Bus extends Vehicle2{
    Bus(){
        System.out.println("This is a Bus");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {
        Car2 car = new Car2();
        Bus bus = new Bus();
    }
}
