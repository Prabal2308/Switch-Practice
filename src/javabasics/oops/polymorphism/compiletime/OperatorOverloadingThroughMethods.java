package javabasics.oops.polymorphism.compiletime;

public class OperatorOverloadingThroughMethods {

    void add (int a, int b){
        System.out.println("Sum of two integers: " + (a + b));
    }

    void add(String a, String b){
        System.out.println("Concatenation of two strings: " + (a + b));
    }

    public static void main(String[] args) {
        OperatorOverloadingThroughMethods obj = new OperatorOverloadingThroughMethods();
        obj.add(5, 10);  // Calls the method with integer parameters
        obj.add("Hello, ", "World!");  // Calls the method with string parameters
    }

    //gives an impression of operator(+) overloading by using methods with same name but different parameter types
}
