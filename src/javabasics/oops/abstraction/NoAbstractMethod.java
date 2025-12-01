package javabasics.oops.abstraction;

abstract class Parent{
    Parent(){
        System.out.println("Abstract class constructor called.");
    }

    void show(){
        System.out.println("This is a concrete method in an abstract class.");
    }
}

class Child extends Parent{
    Child() {
        System.out.println("Child class constructor called.");
    }
}
public class NoAbstractMethod {

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
