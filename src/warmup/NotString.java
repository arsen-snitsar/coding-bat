package warmup;

import java.util.Scanner;

public class NotString {

    public static Scanner keyboard = new Scanner(System.in);

    public static String notString(String str){
        if (str.startsWith("not"))
            return str;
        return "not " + str;
    }

    public static void main(String[] args) {

        System.out.println(notString(keyboard.nextLine()));

    }

}
