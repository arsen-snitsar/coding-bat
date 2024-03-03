package warmup;

import java.util.Scanner;

public class MissingChar {

    public static Scanner keyboard = new Scanner(System.in);

    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public static void main(String[] args) {

        System.out.println(missingChar(keyboard.nextLine(), 1));

    }

}
