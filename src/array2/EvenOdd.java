package array2;

public class EvenOdd {

    private static int[] evenOdd(int[] nums) {
        int lastEven = 0;
        int [] arrayToReturn = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                arrayToReturn[j] = nums[i];
                j++;
                lastEven = j;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1){
                arrayToReturn[lastEven] = nums[i];
                lastEven++;
            }
        }
        return arrayToReturn;
    }


    public static void main(String[] args) {
        for (int i : evenOdd(new int[]{3, 3, 2})) // 2, 3, 3
            System.out.print(i + ", ");
        for (int i : evenOdd(new int[]{1})) // 1
            System.out.print(i + ", ");
    }
}
