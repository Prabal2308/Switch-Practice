package javabasics.polymorphism.compiletime;

public class NumberOfParameters {

    void num1(int a){
        System.out.println("Method with one parameter: " + a);
    }

    void num1(int a, int b){
        System.out.println("Method with two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        NumberOfParameters obj = new NumberOfParameters();
        obj.num1(5);
        obj.num1(10, 20);
    }
}
