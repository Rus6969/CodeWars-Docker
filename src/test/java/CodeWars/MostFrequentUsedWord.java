package CodeWars;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MostFrequentUsedWord {
    public static void main(String[] args) {
        String text = "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e";

        Map<String,Integer> result=new TreeMap<>();

        for (String each: text.split(" ")){
            if(result.containsKey(each)){
                result.put(each,result.get(each)+1);
            }else{
                result.put(each,1);

            }
        }
        Set<Map.Entry<String, Integer>> entrySet = result.entrySet();
        System.out.println(entrySet);




    }
}
