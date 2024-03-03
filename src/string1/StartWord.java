package string1;

public class StartWord {

    private static String startWord(String str, String word) {
        if (word.length()>str.length()){
            return "";
        }
        String first = str.substring(1, word.length());
        String second = word.substring(1);
        if (first.equals(second)){
            return str.charAt(0) + second;
        }
        else {
            return "";
        }
    }


    public static void main(String[] args) {

        System.out.println(startWord("hippo", "i"));

    }
}
