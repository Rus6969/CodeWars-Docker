package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class sortArray {
    public static int[] Sort( int arr[]){
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int each:arr){
            list.add(each);
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=findMax(list);
            list.remove(Integer.valueOf(arr[i]));
        }


        return arr;

    }

      public static int findMax(ArrayList<Integer>a){
        int max=Integer.MIN_VALUE;
        for (int each: a)
            max= Math.max(max,each);
        return max;

      }

    public static void main(String[] args) {
      int  arr[]={1,2,3,56,7867,55,3,22};
        System.out.println(Arrays.toString(Sort(arr)));
    }
}
