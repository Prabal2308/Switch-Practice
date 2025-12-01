package javabasics.oops.constructor;

public class CopyConstructor {
    private String name;
    private int age;

    // Copy Constructor
    CopyConstructor(CopyConstructor obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

    // Parameterized Constructor
    CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
