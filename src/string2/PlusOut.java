package string2;

public class PlusOut {

    private static String plusOut(String str, String word) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != word.charAt(0))
                res = res + '+';
            else {
                String sub = str.substring(i, i + word.length());
                if (sub.equals(word)){
                    res = res + word;
                    i += word.length()-1;
                } else {
                    res = res + '+';
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy")); // "++xy++"
        System.out.println(plusOut("abXYabcXYZ", "abc")); // "++++abc+++"
    }
}
