package string1;

public class ConCat {

    public static String conCat(String a, String b) {
        if (a.isEmpty()){
            return b;
        }
        if (b.isEmpty()){
            return a;
        }
        if (a.substring(a.length()-1).equals(b.substring(0,1))){
            return a + b.substring(1);
        }
        return a + b;
    }


    public static void main(String[] args) {
        System.out.println(conCat("abc", "sad"));
    }
}
