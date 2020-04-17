package CodeWars;

import java.util.Arrays;

public class FindUnique {
    public static double findUnique(double[] arr){

        Arrays.sort(arr);
        if (arr[0] == arr[1]) {
            return arr[arr.length-1];
        }
        return arr[0];
    }






    public static void main(String[] args) {
        double arr[]={1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,};

        System.out.println("findUnique(arr) = " + findUnique(arr));
    }
        }

