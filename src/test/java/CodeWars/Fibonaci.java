package CodeWars;

public class Fibonaci {

    public static int fiba(int n) {
        if (n < 2) {
            return n;
        } else {
            return fiba(n - 1) + fiba(n - 2);
        }
    }


    public static int fibaFull(int num) {
        int result = 0;
        int j = 0;
        int z = 1;

        for (int i = 1; i < num; i++) {

            result = j + z;
            j = z;//1
            z = result;

        }

        return result;
    }

    public static void main(String[] args) {
        int a = 10;
        int t = 12;
        System.out.println("fibaFull(t) = " + fibaFull(t));
        System.out.println("fiba(a) = " + fiba(a));
    }
}
