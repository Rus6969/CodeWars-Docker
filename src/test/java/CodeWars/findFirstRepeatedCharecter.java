package CodeWars;

import java.util.HashSet;

public class findFirstRepeatedCharecter {

    public static Character FirstConsecutive(String word){
        HashSet<Character> set = new HashSet<>();
        char[]chars =word.toCharArray();
          for (Character each: chars ){
              if(set.contains(each)){
                  return each;
              }else set.add(each);

        }
          return '\0';
    }


    public static void main(String[] args) {
        System.out.println(FirstConsecutive("Inna"));
    }
}
