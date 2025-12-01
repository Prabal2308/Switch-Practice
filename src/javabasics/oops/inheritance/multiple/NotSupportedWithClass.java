package javabasics.oops.inheritance.multiple;

class Parent1{
    void fun(){
        System.out.println("This is parent 1");
    }
}

class Parent2{
    void fun(){
        System.out.println("This is parent 2");
    }
}
//public class NotSupportedWithClass extends Parent1, Parent2{
//
//    public static void main(String[] args) {
//        NotSupportedWithClass obj = new NotSupportedWithClass();
//        obj.fun();
//    }
//}

//giving error that cannot extend multiple classes
