package CodeWars;

import java.util.*;

public class StringManipulation {

    public static String unique(String str) {
        String[] arr = str.split("");
        String unique1 = "";
        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[i].equals(arr[k])) {
                    num++;
                }
            }
            if (num == 1)
                unique1 += arr[i];
        }

        return unique1;
    }

    public static String reverseString(String str) {
        StringBuffer sb = new StringBuffer(str);
        return new String(sb.reverse());
    }

    public static String reverseWithLoop(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.toCharArray()[i];
        }
        return result;
    }

    public static String remDuplicates(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(str.charAt((i)) + "")) {
                nonDup += str.charAt((i));

            }
        }
        return nonDup;
    }

    public static boolean sameLetters(String a, String b) {
        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String word1 = "";
        String word2 = "";
        for (char each : arr1) {
            word1 += each;
        }
        for (char each : arr2) {
            word2 += each;
        }
        return word1.equals(word2);

    }

    public static boolean SameleTresset(String a, String b) {
        Set<String>first=new TreeSet<String>(Arrays.asList(a.split("")));
        Set<String>second=new TreeSet<String>(Arrays.asList(b.split("")));
     return first.equals(second);
    }
    public static Map frequancy(String str){
        Map<Character,Integer>result=new HashMap();
        for (Character each: str.toCharArray()){
            if(result.containsKey(each)){
                result.put(each,result.get(each)+1);
            }else{
                result.put(each,1);

            }
        }
             return result;


    }

    public static String returnlastindexspace(String str, int indx){
        return str.substring(0,str.lastIndexOf(" ",indx));


    }
    public static String frequancyWithLOOP(String str){
        String result="";
        String unique="";
        int count = 0;
       for(int i=0; i<str.length();i++){
           if(!unique.contains(""+str.charAt(i))){
               unique+=str.charAt(i);
           }
       }

           for(int i=0; i<unique.length();i++){
               count=0;
               for(int k=0; k<str.length();k++){
               if(str.charAt(k)==unique.charAt(i)) {
                   count++;
               }
               }
               result+=""+unique.charAt(i)+""+count;
           }
        return result;

    }

    public static Map uniqeMap(String str){
        Map<Character,Integer>unique=new HashMap<>();
        for( int j = 0; j < str.length(); j++) {
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if( count == 1){
                unique.put(str.charAt(j), count);
            }
        }
        return unique;
    }

    public static void main(String[] args) {
//        String random = "lksjffffjjj";
//        System.out.println(unique(random));
//        String name = "Ruslan";
//        System.out.println("___________________");
//        System.out.println(reverseString(name));
//        System.out.println("_--___-----______---__---");
//        String name1 = "Mille";
//        System.out.println(reverseWithLoop(name1));
//        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
//
//        String basic = "aaabbbcccz";
//        System.out.println(remDuplicates(random));
//        System.out.println("++++++++++++++++");
//        System.out.println(unique(basic));
//        System.out.println("-------------");
//        String a = "car";
//        String b = "arc";
//        System.out.println(sameLetters(a, b));
//        System.out.println("-------------");
//        System.out.println(SameleTresset(a,b));
//        System.out.println("=-=-=-=-=-=-=-=--=");
//        String ass="aaaasssssssjjjjjkkkkccccccmmmmmppp";
//        System.out.println(frequancy(ass));
//
//        String job= "Im looking for a job";
//        System.out.println(returnlastindexspace(job,18));
//        System.out.println("----------------------------------_---_");
//        String trump = "Pneumonoultramicroscopicsilicovolcanoconiosis";
//        System.out.println(frequancyWithLOOP(trump));

        System.out.println(uniqeMap("Innah"));



    }
}
