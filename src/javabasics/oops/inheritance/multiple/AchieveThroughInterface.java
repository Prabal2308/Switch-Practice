package javabasics.oops.inheritance.multiple;

interface A{
    default void display(){
        System.out.println("This is interface A");
    }
}

interface B{
    default void display(){
        System.out.println("This is interface B");
    }
}

class C implements A, B{

    @Override
    public void display(){
        A.super.display();
        B.super.display();
        System.out.println("This is class C implementing both interfaces A and B");
    }


}
public class AchieveThroughInterface {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
