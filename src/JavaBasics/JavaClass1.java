package JavaBasics;

import java.util.HashMap;
import java.util.Scanner;

public class JavaClass1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        integerIntegerHashMap.put(100, 200000);
        integerIntegerHashMap.put(100, 30000);

        System.out.println(integerIntegerHashMap);
    }
}
