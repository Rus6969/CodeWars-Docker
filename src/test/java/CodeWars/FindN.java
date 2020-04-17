package CodeWars;

public class FindN {
    public static int find(int[] integers) {

        int oddCount = 0;
        for (int n : integers) {
            if (n % 2 != 0) {
                oddCount += 1;
            }
        }

        if (oddCount == 1) {
            for (int n : integers) {
                if (n % 2 != 0) {
                    return n;
                }
            }
        } else {
            for (int n : integers) {
                if (n % 2 == 0) {
                    return n;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}