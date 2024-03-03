package logic2;

public class MakeBricks {

    private static boolean makeBricks(int small, int big, int goal) {
        return ((goal - big * 5 <= small && goal - big * 5 >= 0)
        || (goal % 5 <= small && goal / 5 <= big));
    }


    public static void main(String[] args) {
        System.out.print(makeBricks(3, 2, 9));
    }
}
