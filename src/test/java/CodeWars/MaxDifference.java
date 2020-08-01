package CodeWars;


import java.util.Arrays;


public class MaxDifference {
    public static int maxDiff(int[] lst){
     if(lst.length==0){
         return 0;
     }else{
         Arrays.sort(lst);
         return lst[lst.length-1]-lst[0];
     }
     }




    public static void main(String[] args) {
        int arr[] ={1,2,3,44,5,6};
        System.out.println(maxDiff(arr));
    }
}
