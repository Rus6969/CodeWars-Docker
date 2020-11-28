package CodeWars;

import java.util.Arrays;

public class FindFirstNonConsecutivenumber {
    static Integer find(final int[] array) {
        if(array.length > 0) {
            for(int i=1; i<array.length; i++) {
                if(array[i]-1 != array[i-1]){
                    System.out.println("The element " + array[i] + " at the index " + i + " is the first not consecutive element of the array");
                    return array[i];
                }
            }
        }
        return null; //If we reach the end of the loop, there is no number not consecutive to a previous one.
    }



    public static void main(String[] args) {
     int [] arr ={1,2,3,5};
        System.out.println(find(arr));

    }
}
