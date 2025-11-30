package JavaBasics.oops.accessmodifiers.demo;

import JavaBasics.oops.accessmodifiers.ProtectedClass;

public class ProtectedChildClass extends ProtectedClass {

    @Override
    protected void print() {
        System.out.println("Hello from ProtectedChildClass");
    }

    public static void main(String[] args) {
        ProtectedClass pc = new ProtectedChildClass();
//        pc.print(); cannot access through referenceType of parent class, but canbe if child class is also in the same package

        ProtectedChildClass pcc = new ProtectedChildClass();
        pcc.print(); // can access through referenceType of child class
    }
}
