package javabasics.oops.abstraction;

abstract class Sunstar{
    abstract void printInfo();
}

class Employee extends Sunstar{
    void printInfo(){
        System.out.println("Hello from Employee class");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Sunstar sunstar = new Employee();
        sunstar.printInfo();
    }
}
