package array2;

public class ShiftLeft {

    private static int[] shiftLeft(int[] nums) {
        if (nums.length<1)
            return nums;
        int zeroth = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = zeroth;
        return nums;
    }

    public static void main(String[] args) {

        for (int i : shiftLeft(new int[]{6, 2, 5, 3})) // 2 5 3 6
            System.out.print(i + ", ");

        for (int i : shiftLeft(new int[]{}))
            System.out.print(i + ", ");

    }
}
