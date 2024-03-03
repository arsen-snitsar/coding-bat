package string1;

public class MinCat {

    public static String minCat(String a, String b) {
        if (a.length()>b.length()) {
            return a.substring(a.length()-b.length()) + b;
        }
        if (a.length()<b.length()) {
            return a + b.substring(b.length()-a.length());
        }
        return a+b;
    }


    public static void main(String[] args) {
        System.out.println(minCat("java", "hello"));
    }
}
