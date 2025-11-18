package DSA.questions;

import java.util.Scanner;
import java.util.Stack;

public class SortStackUsingRecursion {

    public static void insertSortedInDecreasingOrder(int value, Stack<Integer> s){
        if(s.empty() || s.peek() <= value){
            s.push(value);
            return;
        }

        int element = s.pop();
        insertSortedInDecreasingOrder(value, s);
        s.push(element);
    }

    public static void insertSortedInAscendingOrder(int value, Stack<Integer> s){
        if(s.empty() || s.peek() >= value){
            s.push(value);
            return;
        }

        int element = s.pop();
        insertSortedInAscendingOrder(value, s);
        s.push(element);
    }

    public static void sortStackUsingRecursionInDecreasingOrder(Stack<Integer> s){
        if(s.empty()){
            return;
        }

        int value = s.pop();
        sortStackUsingRecursionInDecreasingOrder(s);
        insertSortedInDecreasingOrder(value, s);
    }

    public static void sortStackUsingRecursionInIncreasingOrder(Stack<Integer> s){
        if(s.empty()){
            return;
        }

        int value = s.pop();
        sortStackUsingRecursionInIncreasingOrder(s);
        insertSortedInAscendingOrder(value, s);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        System.out.print("Enter the number of elements in Stack: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements of stack: ");
        for(int i = 0; i < n; i++){
            s.add(sc.nextInt());
        }

        Stack<Integer> st = new Stack<>();
        st.addAll(s);
        System.out.println();
        System.out.print("Stack after being sorted in decreasing order: ");
        sortStackUsingRecursionInDecreasingOrder(st);
        for(Integer digit : st){
            System.out.print(digit + " ");
        }

        System.out.println();
        st.clear();
        st.addAll(s);
        System.out.print("Stack after being sorted in increasing order: ");
        sortStackUsingRecursionInIncreasingOrder(st);
        for(Integer digit : st){
            System.out.print(digit + " ");
        }
    }
}
