package string1;

public class WithoutX2 {

    private static String withoutX2(String str) {
        if (!str.isEmpty() && str.charAt(0)=='x'){
            str = str.substring(1);
            if (!str.isEmpty() && str.charAt(0)=='x')
                str = str.substring(1);
        }
        else {
            if (str.length()>1 && str.charAt(1)=='x')
                str = str.charAt(0) + str.substring(2);
        }
        return str;
    }


    public static void main(String[] args) {

        System.out.println(withoutX2(""));

    }
}
