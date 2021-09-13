package SortingAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
// always lookin minimum value and swap it
public class SelectionSort {

    public static int[] selectionSort(int[]array){
        for (int i = 0; i < array.length; i++) {
            int minIndex=i;                     // 0    1  2  3   4  5
            for (int j = i+1; j < array.length; j++)
                if (array[j]<array[minIndex]) minIndex=j;                     //  we want sorted keep separate from not sorted
                swap(array,minIndex,i);

        }
        return array;

    }



    private static void swap(int[] arrayx, int index1, int index2) {
        int temp=arrayx[index1];
        arrayx[index1]=arrayx[index2];
        arrayx[index2]=temp;
    }

    public static void main(String[] args) {
        var myArray=new int[]{1,4,7,-3,2,12};

        System.out.println(Arrays.toString(myArray));
        System.out.println("Selection sort ");
        System.out.println(Arrays.toString(selectionSort(myArray)));

    }

}
