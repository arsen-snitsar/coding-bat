package logic1;

public class Less20 {

    private static boolean less20(int n) {
        return (n%20==19 || n%20==18);
    }

    public static void main(String[] args) {
        System.out.println(less20(18));
        System.out.println(less20(19));
        System.out.println(less20(20));
    }
}
