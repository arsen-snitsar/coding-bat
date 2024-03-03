package array2;

public class TwoTwo {

    private static boolean twoTwo(int[] nums) {
        boolean reached2 = false;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] == 2 && !reached2)
                    && ((i > 0 && nums[i - 1] != 2) || nums.length == 1))
                reached2 = true;
            else if (nums[i] == 2 && reached2)
                reached2 = false;
            else if (nums[i] != 2 && reached2)
                return false;
        }
        return !reached2;
    }

    public static void main(String[] args) {
        System.out.println(twoTwo(new int[]{4, 2, 2, 2}));      // true
        System.out.println(twoTwo(new int[]{2, 2, 2}));         // true
        System.out.println(twoTwo(new int[]{2}));               // false
    }
}
