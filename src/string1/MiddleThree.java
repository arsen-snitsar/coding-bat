package string1;

public class MiddleThree {

    public static String middleThree(String str) {
        return str.substring(str.length()/2-1, str.length()/2+2);
    }

    public static void main(String[] args) {
        System.out.println(middleThree("solving"));
    }
}
