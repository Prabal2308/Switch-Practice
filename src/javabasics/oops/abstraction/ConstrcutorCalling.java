package javabasics.oops.abstraction;

abstract class Parent1{
    Parent1(){
        System.out.println("Parent class constructor called");
    }

    abstract void inherit();
}

class Child1 extends Parent1{
    Child1(){
        System.out.println("Child class constructor called");
    }

    void inherit(){
        System.out.println("Abstract method implemented in Child class");
    }
}

public class ConstrcutorCalling {

    public static void main(String[] args) {
        Parent1 obj = new Child1();
        obj.inherit();
    }
}
