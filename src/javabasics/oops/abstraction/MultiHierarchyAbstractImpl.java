package javabasics.oops.abstraction;

abstract class Demo{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

abstract class FirstChild extends Demo{
    void m1(){
        System.out.println("FirstChild implementation of m1");
    }
}

class SecondChild extends FirstChild{
    void m2(){
        System.out.println("SecondChild implementation of m2");
    }

    void m3(){
        System.out.println("SecondChild implementation of m3");
    }
}

public class MultiHierarchyAbstractImpl {

    public static void main(String[] args) {
        Demo obj = new SecondChild();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
