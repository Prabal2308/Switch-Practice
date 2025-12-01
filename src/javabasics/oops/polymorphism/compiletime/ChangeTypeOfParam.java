package javabasics.oops.polymorphism.compiletime;

public class ChangeTypeOfParam {

    static void show(int a, int b){
        System.out.println("Method with two integer parameters: " + a + ", " + b);
    }

    static void show(double a, double b){
        System.out.println("Method with two double parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        show(5, 10);
        show(5.5, 10.5);
    }
}
