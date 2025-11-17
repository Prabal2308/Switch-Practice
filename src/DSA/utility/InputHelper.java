package DSA.utility;

import java.util.Scanner;

public class InputHelper {

    private static final Scanner scanner = new Scanner(System.in);

    private InputHelper() {
        // Private constructor to prevent instantiation
    }

    public static byte readByte(String msg) {
        System.out.print(msg);
        return scanner.nextByte();
    }

    public static short readShort(String msg) {
        System.out.print(msg);
        return scanner.nextShort();
    }

    public static int readInt(String msg) {
        System.out.print(msg);
        return scanner.nextInt();
    }

    public static long readLong(String msg) {
        System.out.print(msg);
        return scanner.nextLong();
    }

    public static float readFloat(String msg) {
        System.out.print(msg);
        return scanner.nextFloat();
    }

    public static double readDouble(String msg) {
        System.out.print(msg);
        return scanner.nextDouble();
    }

    public static char readChar(String msg) {
        System.out.print(msg);
        return scanner.next().charAt(0);
    }

    public static boolean readBoolean(String msg) {
        System.out.print(msg);
        return scanner.nextBoolean(); // accepts true/false
    }

    public static String readString(String msg) {
        System.out.print(msg);
        return scanner.next(); // reads one word
    }

    public static String readLine(String msg) {
        System.out.print(msg);
        scanner.nextLine();
        return scanner.nextLine();
    }

    public static void close() {
        scanner.close();
    }
}
