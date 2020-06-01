package CodeWars;

public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
        int max = 0;
        for (int i = 0; i < digits.length() - 4; i++) {
            int sub = Integer.valueOf(digits.substring(i, i+5));
            if (sub > max)
                max = sub;
        }
        return max;
    }

    public static void main(String[] args) {
        String number = "3334466678895431200";
        System.out.println(solve(number));
    }
}