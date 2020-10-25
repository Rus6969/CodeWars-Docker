package CodeWars;

import java.util.Arrays;

public class bubbleSort {

    public static int[] BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = i+1; k < arr.length; k++) {
                if (arr[i] > arr[k]) {
                    int temp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        return arr;
    }



    public static void main(String[] args) {
        int[] arr = { 9,2, 5,8,1};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
