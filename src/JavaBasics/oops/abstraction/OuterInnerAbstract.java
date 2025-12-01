package JavaBasics.oops.abstraction;

abstract class A{
    abstract class B{
        abstract void display();
    }
}

class C extends A{
    class D extends B {
        void display() {
            System.out.println("Inner abstract class method implemented in subclass.");
        }
    }
}

public class OuterInnerAbstract {
    public static void main(String[] args) {
        C c = new C();
        C.D d = c.new D();
        d.display();
    }
}
