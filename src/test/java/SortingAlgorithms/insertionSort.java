package SortingAlgorithms;

import java.util.Arrays;

public class insertionSort {
    public static int[] insertion(int[] array) {
        // we are starting from second item bc we are doing insertion operation we compare them
        for (int i = 1; i < array.length; i++) {
            int current= array[i];
            int j=i-1; // the last item of a sorted part
            while(j>=0 && array[j]>current){
                // shifting operation
                array[j+1]=array[j];
                j--; // move to begining of sorted part of array
            }
            // j+1 bc we comparing with current if it not grater we stop
            array[j+1]=current;
        }
        return array;
    }

    public static void main(String[] args) {
        var myArray=new int[]{99,7,4,-3,2,12};

        System.out.println(Arrays.toString(myArray));
        System.out.println("insertion_Sort sort ");
        System.out.println(Arrays.toString(insertion(myArray)));
    }
}
