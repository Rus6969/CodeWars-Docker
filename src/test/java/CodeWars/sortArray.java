package CodeWars;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    public static String sort(final int[] array) {
        // Your code here
        int end = array.length;
        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < end; i++){
            set.add(array[i]);
        }
        int razmer=set.size();
        int i=0;
        int arr2[]=new int[razmer];
        for(int each:set){
            arr2[i++]=each;
        }
        Arrays.sort(arr2);

        return Arrays.toString(arr2);
    }



    public static void main(String[] args) {
      int  arr[]={1,2,2,1,2,3,56,7867,55,3,22};


        System.out.println(sort(arr));
        System.out.println("--=-=-==-=-==-=-=-=-=-=-==-=-=-");

        System.out.println(Arrays.toString(Sort(arr)));
    }
}
