package array1;

public class Front11 {

    private static int[] front11(int[] a, int[] b) {
        int [] res;
        if (a.length>0 && b.length>0){
            res = new int[2];
            res[0] = a[0];
            res[1] = b[0];
        } else if (a.length>0 && b.length<1) {
            res = new int[1];
            res[0] = a[0];
        } else if (b.length>0 && a.length<1) {
            res = new int[1];
            res[0] = b[0];
        } else {
            res = new int[0];
        }
        return res;
    }

    private static void printArray(int[] arrayToPrint){
        for (int i : arrayToPrint)
            System.out.print(i + ", ");
    }

    public static void main(String[] args) {
        printArray(front11(new int[]{1, 2, 3}, new int[]{3, 2, 1}));
    }
}
