package array2;

public class TenRun {

    private static int[] tenRun(int[] nums) {
        int currentMultiple = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0)
                currentMultiple = nums[i];
            else if (currentMultiple != 1)
                nums[i] = currentMultiple;
        }
        return nums;
    }


    public static void main(String[] args) {
        for (int i : tenRun(new int[]{2, 10, 3, 4, 20, 5})) // 2, 10, 10, 10, 20, 20
            System.out.print(i + ", ");
    }
}
