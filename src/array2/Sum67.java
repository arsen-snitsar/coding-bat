package array2;

public class Sum67 {

    private static int sum67(int[] nums) {
        int sum = 0;
        boolean reachedSix = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6)
                reachedSix = true;
            else if (!reachedSix)
                sum += nums[i];
            else if (nums[i] == 7)
                reachedSix = false;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum67(new int[]{1, 2, 2}));                 // 5
        System.out.println(sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));   // 5
        System.out.println(sum67(new int[]{1, 1, 6, 7, 2}));           // 4
        System.out.println(sum67(new int[]{2, 7, 6, 2, 6, 7, 2, 7}));  // 18
    }
}