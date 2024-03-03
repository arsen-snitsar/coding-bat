package string2;

public class XyzMiddle {

    private static boolean xyzMiddle(String str){

        int charsLeft = -1, charsRight = -10;

        if (str.length()<3)
            return false;
        if(str.equals("xyz"))
            return true;

        for (int i = str.length()/2-2; i < str.length()/2+2; i++){
            if((str.charAt(i) == 'x'
                    && str.charAt(i+1) == 'y'
                    && str.charAt(i+2) == 'z')){
                charsLeft = i;
                charsRight = str.length()-i-3;
            }
        }
        return Math.abs(charsRight - charsLeft) <= 1;

    }

    public static void main(String[] args) {
        System.out.println(xyzMiddle("xyz"));
    }
}
