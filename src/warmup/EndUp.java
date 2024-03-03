package warmup;

public class EndUp {

    public static String endUp(String stringToEndUp){
        if (stringToEndUp.length()<3){
            return stringToEndUp.toUpperCase();
        }
        else {
            return stringToEndUp.substring(0, stringToEndUp.length()-3)
                    + stringToEndUp.substring(stringToEndUp.length()-3).toUpperCase();
        }
    }

    public static void main(String[] args) {
        String str = "hi";
        System.out.println(endUp(str));
    }
}
