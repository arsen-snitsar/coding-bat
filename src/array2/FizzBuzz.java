package array2;

public class FizzBuzz {
    private static String[] fizzBuzz(int start, int end) {
        String[] str = new String[end - start];
        for (int i = 0; i < end - start; i++) {
            if ((i + start) % 3 == 0 && (i + start) % 5 == 0)
                str[i] = "FizzBuzz";
            else if ((i + start) % 3 == 0)
                str[i] = "Fizz";
            else if ((i + start) % 5 == 0)
                str[i] = "Buzz";
            else str[i] = String.valueOf(i + start);
        }
        return str;
    }

    public static void main(String[] args) {
        for (String arg : fizzBuzz(1, 16)) {
            System.out.print(arg + ", ");
        }
    }
}
