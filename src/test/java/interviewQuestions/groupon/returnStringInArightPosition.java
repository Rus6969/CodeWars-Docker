package interviewQuestions.groupon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class returnStringInArightPosition {
    /*
Your order, please
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
     */


    public static void main(String[] args) {
        String phrase="is2 Thi1s T4est 3a";
        System.out.println(order(phrase));
        System.out.println("-*-*-*-*-*-*-*-*-*");
        System.out.println(order_Without_Tokenizer(phrase));

    }
    public static String order(String string) {
        List<Character> numbers = new ArrayList<Character>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
        StringTokenizer st = new StringTokenizer(string);
        String[] stringWords = new String[st.countTokens()];

        while (st.hasMoreTokens()) {
            String currentWord = st.nextToken();
            for (int i = 0; i < currentWord.length(); i++) {
                if (numbers.contains(currentWord.charAt(i))) {
                    stringWords[numbers.indexOf(currentWord.charAt(i))] = currentWord;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s: stringWords) {
            sb.append(s + ' ');
        }
        return sb.toString().trim();
    }


    public static String order_Without_Tokenizer(String words) {

        String[] _words = words.split(" ");
        String[] out = new String[_words.length];

        for (int i=0; i<_words.length; i++) {
            for (Character c : _words[i].toCharArray()) {
                if (Character.isDigit(c)) {
                    out[Character.getNumericValue(c)-1] = _words[i];
                }
            }
        }

        if (out.length<=1) return "";

        return java.util.Arrays.stream(out).collect(java.util.stream.Collectors.joining(" "));
    }
}
