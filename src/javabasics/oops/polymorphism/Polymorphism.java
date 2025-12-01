package javabasics.oops.polymorphism;

class Person{
    void showRole(){
        System.out.println("I am a person");
    }
}

class Father extends  Person{
    void showRole(){
        System.out.println("I am a Father");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Person p = new Person();
        p.showRole();

        Person f = new Father();
        f.showRole();

        //java dynamically binds the method at runtime based on the object type
    }
}

