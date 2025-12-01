package javabasics.oops.polymorphism.runtime;

class A{
    void display(){
        System.out.println("Class A method called");
    }
}

class B extends A{
    void display(){
        System.out.println("Class B method called");
    }
}

class C extends A{
    void display(){
        System.out.println("Class C method called");
    }
}

class D extends A{
}

public class ParentReferenceChildObject {
    public static void main(String[] args) {
        A a = new B();
        a.display();
        a = new C();
        a.display();
        a = new D();
        a.display();
    }
}