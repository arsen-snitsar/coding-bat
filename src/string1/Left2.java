package string1;

public class Left2 {

    public static void left2(String str) {
        String res = str.substring(2) + str.substring(0, 2);
        System.out.println(res);
    }


    public static void main(String[] args) {
        left2("Hello");
    }
}
