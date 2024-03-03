package warmup;

import java.util.Scanner;

public class DelDel {

    public static Scanner keyboard = new Scanner(System.in);

    public static String delDel(String str) {
        if ((str.length() <= 3) || (!str.startsWith("del", 1)))
            return str;
        return str.charAt(0) + str.substring(4);
    }


    public static void main(String[] args) {
        System.out.println(delDel(keyboard.nextLine()));
    }

}
