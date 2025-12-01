package JavaBasics.oops.abstraction;

abstract class Parent2{
    final void display(){
        System.out.println("This is a final method in an abstract class.");
    }
}

class Child2 extends Parent2{
    // Trying to override the final method will result in a compilation error
    // void display(){
    //     System.out.println("Attempting to override final method.");
    // }
}
public class FinalMethod {

    public static void main(String[] args) {
        Parent2 obj = new Child2();
        obj.display();
    }
}
