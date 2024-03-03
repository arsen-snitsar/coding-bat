package string1;

public class HasBad {

    public static boolean hasBad(String str) {
        if ((str.length()<4) && !str.equals("bad")) {
            return false;
        }
        else {
            return str.startsWith("bad") || str.substring(1, 4).equals("bad");
        }
    }

    public static void main(String[] args) {
        System.out.println(hasBad("xbadxx"));
    }
}
