package array2;

public class Post4 {

    private static int[] post4(int[] nums) {
        int indexNextTo4 = -1;
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] == 4) {
                indexNextTo4 = i + 1;
                break;
            }
        }

        int [] arrayToReturn = new int[nums.length-indexNextTo4];
        for (int i = 0; i < arrayToReturn.length; i++) {
            arrayToReturn[i] = nums[indexNextTo4+i];
        }
        return  arrayToReturn;
    }

    public static void main(String[] args) {
        for (int i : post4(new int[]{2, 4, 1, 4, 3, 2}))    // 3, 2
            System.out.print(i + ", ");
    }
}
