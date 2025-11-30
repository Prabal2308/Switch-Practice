package JavaBasics.oops.inheritance;

public class InhertitingParentstaticmethod {

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.greet();
    }
}

class Parent{
    static void greet(){
        System.out.println("Hello from Parent class");
    }
}

class Child extends Parent{
    static void greet(){
        System.out.println("Hello from Child class");
    }
}
