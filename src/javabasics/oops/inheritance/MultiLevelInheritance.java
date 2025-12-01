package javabasics.oops.inheritance;

class Vehicle1{
    Vehicle1(){
        System.out.println("This is a vehicle");
    }
}

class FourWheeler extends Vehicle1{
    FourWheeler(){
        System.out.println("This is a 4 wheeler vehicle");
    }
}

class Car1 extends FourWheeler{
    Car1(){
        System.out.println("This 4 wheeler vehicle is a car");
    }
}
public class MultiLevelInheritance {

    public static void main(String[] args) {
        Car1 obj = new Car1();
    }

}
