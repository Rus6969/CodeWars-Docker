package Instream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class findMissingInArray {

    public static int findMissingNumber(int[] numbers) {
        return IntStream.rangeClosed(1,numbers.length+1).sum() - Arrays.stream(numbers).sum();
    }

}

