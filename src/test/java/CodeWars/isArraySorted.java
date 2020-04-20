package CodeWars;


import java.util.Arrays;

public class isArraySorted {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        int[] sort= new int [arr.length];
        System.arraycopy(arr,0,sort,0,arr.length);
        Arrays.sort(sort);
        System.out.println(Arrays.equals(arr, sort));
    }
    }

