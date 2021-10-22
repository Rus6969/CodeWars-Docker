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




    /////////////////second solution////////////////////
    public int[] quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);

        return arr;
    }

    // Helper function to recursively perform quicksort
    // quicksort will be called recursively for the elemnts to the left of pivot
    // And the elements to the right of pivot
    private void quicksort(int[] arr, int left, int right) {

        // Only proceed if left is less than right
        if (left < right) {
            // Find the position of pivot
            int pivotFinalRestingPosition = partition2(arr, left, right);

            // Recursively call left and right subarray to the pivot
            quicksort(arr, left, pivotFinalRestingPosition - 1);
            quicksort(arr, pivotFinalRestingPosition + 1, right);
        }
    }

    /*
     * The partition function that chooses a pivot, partitions the array around the
     * pivot, places the pivot value where it belongs, and then returns the index of
     * where the pivot finally lies
     */
    public int partition2(int[] arr, int left, int right) {
        int pivot = arr[right];

        /*
         * i will keep track of the "tail" of the section of items less than the pivot
         * so that at the end we can "sandwich" the pivot between the section less than
         * it and the section greater than it
         */
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;

                swap2(arr, i, j);
            }
        }

        swap2(arr, i + 1, right);

        return i + 1; // Return the pivot's final resting position
    }

    // Helper function to swap elements at 2 different array indices
    private void swap2(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void main(String[] args) {
        var myarray=new int[]{6,8,3,9,7};
        QuickSort quickSort = new QuickSort();
        quickSort.quicksort(myarray);
        System.out.println(Arrays.toString(myarray));
    }
}
