package string1;

public class LastChars {

    public static String lastChars(String a, String b) {
        if (a.isEmpty())
            return "@" + b.substring(b.length()-1);
        if (b.isEmpty())
            return a.charAt(0) + "@";
        return a.charAt(0) + b.substring(b.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));
    }
}