package array2;

public class ZeroFront {

    private static int[] zeroFront(int[] nums) {
        int [] arrayToReturn = new int[nums.length];

        for (int i = nums.length-1, j = nums.length-1; i >= 0; i--){
            if (nums[i] != 0){
                arrayToReturn[j] = nums[i];
                j--;
            }
        }

        return arrayToReturn;
    }


    public static void main(String[] args) {
        for (int i : zeroFront(new int[]{0, 1, 1, 0, 1})) // 0, 0, 1, 1, 1
            System.out.print(i + ", ");
    }
}
