package string2;

public class SameStarChar {

    private static boolean sameStarChar(String str) {
        for (int i = 2; i < str.length(); i++) {
            if (str.charAt(i - 2) != str.charAt(i) && str.charAt(i - 1) == '*')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sameStarChar("xa*a*")); // true
        System.out.println(sameStarChar("xy*yzz")); // true
        System.out.println(sameStarChar("*xa*bz")); // false
        System.out.println(sameStarChar("*12*2*2")); // true
        System.out.println(sameStarChar("XY*YYYY*Y*")); // true
    }
}
