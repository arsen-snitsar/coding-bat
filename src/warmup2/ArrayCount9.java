package warmup2;

public class ArrayCount9 {

    private static int arrayCount(int[] nums){
        int count = 0;
        for (int currentNum : nums) {
            if (currentNum==9)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(arrayCount(new int[]{1, 2, 9, 9, 9, 9}));
    }

}
