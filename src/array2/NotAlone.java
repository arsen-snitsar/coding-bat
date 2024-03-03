package array2;

public class NotAlone {

    private static int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length-1; i++)
            if (nums[i] == val && nums[i-1] != val && nums[i+1] != val)
                nums[i] = Math.max(nums[i-1], nums[i+1]);
        return nums;
    }


    public static void main(String[] args) {
        for (int i : notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2)) // 1, 3, 3, 5, 5, 2
            System.out.print(i + ", ");
    }
}
