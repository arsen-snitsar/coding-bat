package warmup;

public class EveryNth {

    public static String everyNth(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i+=n) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(everyNth("Chocolates", 100));
    }
}
