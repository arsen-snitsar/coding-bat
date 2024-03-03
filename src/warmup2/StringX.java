package warmup2;

public class StringX {

    private static String stringX(String str) {
        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i)=='x') {
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
    }
}
