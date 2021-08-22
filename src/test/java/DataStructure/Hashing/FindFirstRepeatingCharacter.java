package DataStructure.Hashing;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(findFirstRepeatedChar("a green apple"));
    }
    public static char findFirstRepeatedChar(String str) {
        Set<Character> set = new HashSet<>();
        for( char each:str.toCharArray()){
            if(set.contains(each))
                return each;
           set.add(each);
    }

        return Character.MIN_VALUE;
    }
}
