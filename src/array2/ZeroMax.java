package array2;

public class ZeroMax {

    private static int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int maxOdd = 0;
                for (int j = i; j < nums.length; j++)
                    if (nums[j] % 2 == 1 && nums[j] > maxOdd) maxOdd = nums[j];
                nums[i] = maxOdd;
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        for (int i : zeroMax(new int[]{0, 5, 0, 3})) // 5, 5, 3, 3
            System.out.print(i + ", ");
    }
}
