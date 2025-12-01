package JavaBasics.oops.abstraction.abstractclass;

abstract class Parent4 {
    static void display() {
        System.out.println("Static method in abstract class called.");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Parent4.display();
    }
}
