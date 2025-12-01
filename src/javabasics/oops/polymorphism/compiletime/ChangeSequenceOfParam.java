package javabasics.oops.polymorphism.compiletime;

public class ChangeSequenceOfParam {

    static void show(int a, double b){
        System.out.println("Method with int and double parameters: " + a + ", " + b);
    }

    static void show(double a, int b){
        System.out.println("Method with double and int parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        show(5, 10.5);
        show(5.5, 10);
    }
}
