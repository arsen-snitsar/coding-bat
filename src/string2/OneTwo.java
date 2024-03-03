package string2;

public class OneTwo {

    private static String oneTwo(String str) {
        String res = "";
        for (int i = 3; i <= str.length(); i += 3) {
            String sub = str.substring(i - 3, i);
            res = res + sub.substring(1) + sub.charAt(0);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(oneTwo("tca")); // cat
        System.out.println(oneTwo("abc")); // bca
        System.out.println(oneTwo("tcagdo")); // catdog
    }
}
