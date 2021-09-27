package CodeWars;

import java.util.HashMap;
import java.util.Map;

public class FindSumOf2InArray {
/*
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Output: Because nums[0] + nums[1] == 9, we return [0, 1]
    Should only use one loop
 */

    public static void findZalupu(int[] A, int target)
    {
        // consider each element except the last
        for (int i = 0; i < A.length - 1; i++)
        {
            // start from the i'th element until the last element
            for (int j = i + 1; j < A.length; j++)
            {
                // if the desired sum is found, print it
                if (A[i] + A[j] == target)
                {
                    System.out.println("Pair found (" + A[i] + ", " + A[j] + ")");
                    return;
                }
            }
        }

        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }

    public static void findPair(int[] A, int target)
    {
        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();

        // do for each element
        for (int i = 0; i < A.length; i++)
        {
            // check if pair `(A[i], target-A[i])` exists

            // if the difference is seen before, print the pair
            if (map.containsKey(target - A[i]))
            {
                System.out.printf("Pair found (%d, %d)", A[map.get(target - A[i])], A[i]);
                return;
            }

            // store index of the current element in the map
            map.put(A[i], i);
        }

        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }

    public static void main (String[] args)
    {
        int[] A = { 2,7,11,15 };
        int target = 9;

        //findZalupu(A, target);
        findPair(A,9);
    }
}

