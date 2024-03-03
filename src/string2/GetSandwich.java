package string2;

public class GetSandwich {

    private static String getSandwich(String str) {

        int firstBread = -1;
        int secondBread = -1;

        for (int i = 5; i <= str.length(); i++) {
            String sub = str.substring(i-5, i);
            if (sub.equals("bread")){
                if (firstBread == -1)
                    firstBread = i;
                else
                    secondBread = i-5;
            }
        }

        if (firstBread == -1 || secondBread == -1)
            return "";
        else
            return str.substring(firstBread, secondBread);

    }

    public static void main(String[] args) {
        System.out.println(getSandwich("xxbreadyy"));
    }
}
