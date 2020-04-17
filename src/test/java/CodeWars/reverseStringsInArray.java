package CodeWars;

import java.util.Arrays;

public class reverseStringsInArray {
    public static String[] RevArr(String[] arr) {
        String[] result = new String[4];
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"Ruslan", "Inna"};
        String first = "";


        for (int i = 0; i <arr.length ; i++) {
            first = arr[i];
            String second = "";

            for (int k = first.length()-1; k >= 0; k--) {
                second += "" + first.charAt(k);
            }
                arr[i] = second;
            }

        System.out.println(Arrays.toString(arr));

    }



}



