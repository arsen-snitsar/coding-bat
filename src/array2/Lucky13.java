package array2;

public class Lucky13 {

    private static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(lucky13(new int[]{0, 2, 4})); // true
        System.out.println(lucky13(new int[]{1, 2, 3})); // false
        System.out.println(lucky13(new int[]{1, 2, 4})); // false
    }
}
