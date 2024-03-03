package array2;

public class WithoutTen {

    private static int[] withoutTen(int[] nums) {
        int [] arrayToReturn = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; i++){
            if (nums[i] != 10){
                arrayToReturn[j] = nums[i];
                j++;
            }
        }
        return arrayToReturn;
    }


    public static void main(String[] args) {
        for (int i : withoutTen(new int[]{1, 10, 10, 2})) // 1, 2, 0, 0
            System.out.print(i + ", ");
    }
}
