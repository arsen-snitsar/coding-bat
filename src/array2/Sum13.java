package array2;

public class Sum13 {

    private static int sum13(int[] nums) {
        int sum = 0;
        if (nums.length > 0 && nums[0] != 13)
            sum += nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 13 && nums[i - 1] != 13)
                sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum13(new int[]{}));                 // 0
        System.out.println(sum13(new int[]{1, 2, 2, 1}));       // 6
        System.out.println(sum13(new int[]{1, 1}));             // 2
        System.out.println(sum13(new int[]{1, 2, 2, 1, 13}));   // 6
    }
}
