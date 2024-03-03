package array2;

public class FizzArray3 {

    private static int[] fizzArray3(int start, int end) {
        int arrayLength = end-start;
        int[] arrayToReturn = new int [arrayLength];
        for (int i = 0; i < arrayLength; i++)
            arrayToReturn[i] = start + i;
        return arrayToReturn;
    }


    public static void main(String[] args) {
        for (int i : fizzArray3(5, 10)) {
            System.out.print(i + ", ");
        }
    }
}
