package JavaBasics.oops.constructor;

public class ParamterizedConstructor {
    private String name;
    private int age;

    ParamterizedConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
