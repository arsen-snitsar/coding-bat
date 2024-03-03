package string2;

public class StarOut {

    private static String starOut(String str) {

        String res = "";

        if ((str.length() > 0 && str.charAt(0) != '*') && (str.length() > 1 && str.charAt(1) != '*'))
            res = str.substring(0, 1);

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i - 1) == '*' || str.charAt(i) == '*' || str.charAt(i + 1) == '*') {

            } else {
                res = res + str.charAt(i);
            }
        }

        if (str.equals("*"))
            return "";

        if (((str.length() > 1 && str.charAt(str.length() - 1) == '*')
                || (str.length() > 1 && str.charAt(str.length() - 2) == '*')) || str.length() < 1)
            return res;
        else
            return res + str.charAt(str.length() - 1);

    }

    public static void main(String[] args) {
        System.out.println(starOut("a")); // "a"
        System.out.println(starOut("*")); // ""
    }
}
