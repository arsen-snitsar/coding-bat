package string2;

public class WordEnds {

    private static String wordEnds(String str, String word) {
        String res = "";
        for (int i = 0; i <= str.length() - word.length(); i++) {
            String sub = str.substring(i, i + word.length());
            if (sub.equals(word)) {
                if (i > 0) {
                    res = res + str.charAt(i - 1);
                }
                if (i + word.length() < str.length()){
                    res = res + str.charAt(i + word.length());
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY")); // c13i
        System.out.println(wordEnds("XY123XY", "XY")); // 13
    }
}
