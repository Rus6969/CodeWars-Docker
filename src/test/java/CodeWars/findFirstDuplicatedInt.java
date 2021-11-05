package CodeWars;

import java.util.HashSet;
import java.util.Set;

public class findFirstDuplicatedInt {

        public static int findDuplicate(int[] array) {
            Set<Integer> seen = new HashSet<Integer>();
            for (int number : array) {
                if (seen.contains(number)) {
                    return number;
                }
                seen.add(number);
            }

            return -1;
        }




    public static void main(String[] args) {
        int arr[]={1,2,4,5,2,6,6,3,1,1};
        System.out.println(findDuplicate(arr));
    }
}
