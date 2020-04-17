package CodeWars;

import java.util.HashMap;
import java.util.Map;

public class maaaaaaaapFreq {
    public static Map freq(String str){
        Map<Character,Integer>actual= new HashMap<Character, Integer>();
        for(Character each: str.toCharArray()){
            if(actual.containsKey(each)){
                actual.put(each,actual.get(each)+1);
            }else {
                actual.put(each,1);
            }
        }

        return actual;
        }

    public static void main(String[] args) {
        String PPP="QQQQQWWEEERRRTY";

        System.out.println(freq(PPP));
    }

}
