package CodeWars;


import java.util.ArrayList;


public class SplitString {
    public static void main(String[] args) {
      String str ="rrr";
    }

    public static ArrayList<String> solution(String s) {
        ArrayList<String> arr = new ArrayList<>();

        if (s.length() % 2 == 0) {

            for (int i = 0; i < s.length(); i += 2) {

                arr.add("" + s.charAt(i) + s.charAt(i + 1));

            }
            return arr;


        } else {
            StringBuilder result = new StringBuilder(s);
            result.append("_");
            result.toString();
            for (int k = 0; k < result.length(); k += 2) {

                arr.add("" + result.charAt(k) + result.charAt(k + 1));

            }
        }
        return arr;

    }

    public static String[] solution1(String s) {
        String[] arr = s.split("(?<=\\G.{2})");

        if(s.length()%2 == 1)
            arr[arr.length-1] += "_";

        return arr;
    }
}
