package CodeWars;

import java.util.ArrayList;
import java.util.Collections;

public class highestAndLowest {
    //In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
    //Notes:
    //
    //All numbers are valid Int32, no need to validate them.
    //There will always be at least one number in the input string.
    //Output string must be two numbers separated by a single space, and highest number is first.
    public static void main(String[] args) {
        String str = "1 2 3 -4 5";
        ArrayList<Integer> list = new ArrayList<>();
        String[] arr = str.split(" ");
        // System.out.println(Arrays.toString(arr));
        for (String each : arr) {
            list.add(Integer.parseInt(each));
        }
        int min = Collections.min(list);
        int max = Collections.max((list));
         String result = max+" "+min;
        System.out.println(result);
    }

    

}
