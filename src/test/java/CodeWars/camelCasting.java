package CodeWars;

import java.util.Arrays;


public class camelCasting {
    public static void main(String[] args) {
        String str = "camelCasting";
        StringBuilder result = new StringBuilder();

        char[] arr=str.toCharArray();
        System.out.println(Arrays.toString(arr));
        for(Character each: arr){
            if(Character.isUpperCase(each)){
                result.append(" ").append(each).toString();
            }else{
                result.append(each).toString();
            }
        }
        result.toString();

        System.out.println(result);




    }
}
