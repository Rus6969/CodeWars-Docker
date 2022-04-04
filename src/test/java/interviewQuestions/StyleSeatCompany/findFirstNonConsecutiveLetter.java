package interviewQuestions.StyleSeatCompany;

import java.util.*;
import java.util.Map.Entry;

public class findFirstNonConsecutiveLetter {
    public static void main(String[] args) {
        System.out.println(findFirstNonConsecutiveLetter("tteestteer"));
        System.out.println(firstNonRepeatedCharacter("Rruuslaaan"));
    }


    static Character findFirstNonConsecutiveLetter(String word) {
        /*
      Store the repeating and nonRepeating characters separately. At the end of the iteration,
      the first element of the nonRepeatingChars list is the first non-repeated character.
         */
        ArrayList<Character> NONrepeatedList = new ArrayList<>();
        Set<Character> RepeatedSet = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (RepeatedSet.contains(letter)) {
                continue;
            }
            if (NONrepeatedList.contains(letter)) {
                NONrepeatedList.remove((Character) letter);
                RepeatedSet.add(letter);
            } else {
                NONrepeatedList.add(letter);
            }
        }
        return NONrepeatedList.get(0);
    }

    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> characterhashtable =
                new LinkedHashMap<Character, Integer>();
        int length;
        Character ch;
        length = str.length();  // Scan string and build hash table
        for (int i = 0; i < length; i++) {
            ch = str.charAt(i);
            if (characterhashtable.containsKey(ch)) {
                // increment count corresponding to ch
                characterhashtable.put(ch, characterhashtable.get(ch) + 1);
            } else {
                characterhashtable.put(ch, 1);
            }
        }
        for (Entry<Character, Integer> entry : characterhashtable.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }


    static String coutFrequency(String str) {
        String res = "";
        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {


            int freq = Collections.frequency(Arrays.asList(str.split("")), each);

            if (freq == 1) {
                return res += each;
            }
        }
        return res;

    }

    public static Character findFirstNonRepeatableChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap();
        for (Character ch : str.toCharArray()) {
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }
        return map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
    }
}




