package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintFirstLastChar {


    public static String arr( String[]arr){


        return null;
    }


    public static void main(String[] args) {
         String[] names ={"Ruslan","Ali","inna"};
         String temporary ="";
        String []arr = new String[names.length];

         for (String each: names){
            temporary=  each.substring(0,1)+each.substring(each.length()-1);
            for (int i=0; i<arr.length;i++ ){
                arr[i]=temporary;
            }
         }
        System.out.println(Arrays.toString(arr));
    }
}
