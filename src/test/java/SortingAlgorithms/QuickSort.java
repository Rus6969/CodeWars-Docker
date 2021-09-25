package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public void sort(int[] array) {
        //array-1  pivot as a last elemet
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int start, int end) {
        if (start >= end) // termination criteria one element or already sorted
            return;
           //boundary is an end of a left partitioner
        var boundary = partition(array, start, end);
  // sort for lef partition and right
        sort(array, start, boundary - 1); // left array part
        sort(array, boundary + 1, end); // right array part
    }

    // all greater items on a right smaller on a left , pivot can be at any place
    private int partition(int[] myArr, int start, int end) {
        var pivot = myArr[end];
        var boundary = start;
        for (int i = start; i <= end; i++) {
            if (myArr[i] <= pivot)
                swap(myArr, i, boundary++);
        }
        return boundary-1;
    }
    //private int partition(int[] array, int start, int end) {

    //  var pivot = array[end];
    //  var boundary = start - 1;
    //  for (var i = start; i <= end; i++)
    //    if (array[i] <= pivot)
    //        swap(array, i, ++boundary);

    //return boundary;
    //   }

    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        var myarray=new int[]{8, 2, 4, 1, 3,0,-1};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(myarray);
        System.out.println(Arrays.toString(myarray));
    }
}
