package DataStructure.Heap;

import java.util.Arrays;
import java.util.Collections;

public class findKelementInAheap {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,87,33};
        int arr2[]= new int[arr.length];
        //n log(n)
       // Arrays.stream(arr).sorted();
        //
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+",");
        }



    }


}
