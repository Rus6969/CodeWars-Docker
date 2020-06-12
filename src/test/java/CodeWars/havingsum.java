package CodeWars;

public class havingsum {
    static int halvingSum(int n) {
        int sum = 0, divisor = 1;
        while (n / divisor != 0) {
            sum += n / divisor;
            divisor *= 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        int r=11;

        System.out.println(halvingSum(r));
    }
/*
Task
Given a positive integer n, calculate the following sum:

n + n/2 + n/4 + n/8 + ...
All elements of the sum are the results of integer division.

Example
25  =>  25 + 12 + 6 + 3 + 1 = 47
 */

}
