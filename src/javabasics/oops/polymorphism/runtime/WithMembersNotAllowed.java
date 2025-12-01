package javabasics.oops.polymorphism.runtime;

class A1{
    int x = 10;
}

class B1 extends A1{
    int x = 20;
}

public class WithMembersNotAllowed {

    public static void main(String[] args) {
        A1 a = new B1();
        System.out.println(a.x); // Outputs 10, not 20 since variables cannot be overridden in Java
    }
}
