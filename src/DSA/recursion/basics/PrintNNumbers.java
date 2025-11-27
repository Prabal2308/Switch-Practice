package DSA.recursion.basics;

public class PrintNNumbers {

    static void fun1(int n){
        if(n > 0){
            System.out.print(n + " ");
            fun1(n - 1); // since first the number is printed in calling phase then the recursive call is made, this is called tail recursion, if instead first the recursive call is made and then the number is printed in the returning phase it is called head recursion
        }
    }
    public static void main(String[] args) {
        int x = 5;
        fun1(x);
    }
}
