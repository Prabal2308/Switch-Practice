package javabasics.oops.constructor;

public class Demo {

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        obj.display();

        ParamterizedConstructor paramObj = new ParamterizedConstructor("Alice", 30);
        paramObj.display();

        CopyConstructor copyObj = new CopyConstructor("Bob", 40);
        CopyConstructor copiedObj = new CopyConstructor(copyObj);
        copiedObj.display();

//        PrivateConstructor pc = new PrivateConstructor(); cannot access private constructor
        PrivateConstructor.display();
    }
}
