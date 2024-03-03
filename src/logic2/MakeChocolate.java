package logic2;

public class MakeChocolate {

    private static int makeChocolate(int small, int big, int goal) {

        if (goal > small+big*5)
            return -1;
        if (goal%5 > small)
            return -1;
        if (big < goal/5 && small >= goal-big*5){
            return goal-big*5;
        }
        return goal%5;

    }


    public static void main(String[] args) {

        System.out.println(makeChocolate(4, 1, 9)); // 4
        System.out.println(makeChocolate(4, 1, 10)); // -1
        System.out.println(makeChocolate(4, 1, 7)); // 2

        System.out.println(makeChocolate(1, 2, 7)); // -1
        System.out.println(makeChocolate(6, 1, 10)); // 5

    }
}
