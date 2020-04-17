package CodeWars;

import java.util.HashMap;
import java.util.Map;

public class findOddTimesAppear {

//Given an array, find the integer that appears an odd number of times.
//
//There will always be only one integer that appears an odd number of times.

    public static int findIt(int[] a) {
        int odd = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer each : a) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }

        }
        for (Integer each : map.values()) {
            if (each % 2 != 0) {
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (each == (entry.getValue())) {
                        odd = entry.getKey();
                    }
                }
            }
        }
        return odd;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,2,3,3,3};
        System.out.println("findIt(arr) = " + findIt(arr));

    }
}
