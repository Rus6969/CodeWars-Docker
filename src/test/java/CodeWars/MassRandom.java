package CodeWars;

import java.util.Arrays;

public class MassRandom {
    public static int[] N(int n) {
        // creating the int array with and setup the length of Array by n value.
        int array[] = new int[n];
        // creating int variable as will have amount of value each indexes in array.
        int finalValue = 0;
        // creating for loop;
        for (int i = 0; i < array.length; i++) {
            // creating if statement, we are waiting when i will be equal last index of the
            // our array.
            if (i == array.length - 1) {
                // if its true , we are assigning to last index negative value of finalVariable
                array[i] = -finalValue;
                break;
            }
            // if false, we are asiging to each index in array random digit from -10 to 10
            array[i] = ((int) (Math.random() * 20) - 10);
            // then we are adding value of each index to our variable
            finalValue += array[i];
        }
        // return our array
        return array;
    }
    public static void main(String[] args) {
        //call method N in main method and assign there length of array using parameter of the method N.
        System.out.println(Arrays.toString(N(8)));
    }
}
