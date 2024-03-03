package string2;

public class ZipZap {

    private static String zipZap(String str) {

        if (str.length()<3)
            return str;

        String res = str.substring(0, 1);

        for (int i = 1; i < str.length()-1; i++) {
            if (!(str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p'))
                res = res + str.charAt(i);
        }

        return res + str.charAt(str.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap")); // zpXzp
        System.out.println(zipZap("zopzop")); // zpzp
        System.out.println(zipZap("zzzopzop")); // zzzpzp
        System.out.println(zipZap("zi")); // zi
        System.out.println(zipZap("zzp")); // zp
        System.out.println(zipZap("z")); // z
        System.out.println(zipZap("")); // zp
    }
}
