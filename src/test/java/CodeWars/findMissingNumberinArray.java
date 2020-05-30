package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findMissingNumberinArray {

    public static int findMissingNumber(int[] numbers) {
        // TODO replace with your code
        int n= numbers.length;

        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= numbers[i];
        return total;

    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,7,};
        System.out.println(findMissingNumber(arr));
    }
}

