package interviewQuestions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class findFirstNonconscutive {
    /*
     * Using HashMap to find first non-repeated character from String in Java.
     * Algorithm :
     * Step 1 : Scan String and store count of each character in HashMap
     * Step 2 : traverse String and get count for each character from Map.
     *          Since we are going through String from first to last character,
     *          when count for any character is 1, we break, it's the first
     *          non repeated character. Here order is achieved by going
     *          through String again.
     */
    public static char firstNonRepeatedCharacter(String word) {
        HashMap<Character,Integer> scoreboard = new HashMap<>();
        // build table [char -> count]
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.containsKey(c)) {
                scoreboard.put(c, scoreboard.get(c) + 1);
            } else {
                scoreboard.put(c, 1);
            }
        }
        // since HashMap doesn't maintain order, going through string again
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.get(c) == 1) {
                return c;
            }
        }
        throw new RuntimeException("Undefined behaviour");
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 6, 7, 9, 11};
        findNonConsecutive(numbers);
        findNonConsecutiveUsingStream(numbers);
        findNonConsecutiveUsingAtomicInteger(numbers);
    }

    private static void findNonConsecutive(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) { // 1, 2, 3, 4, 6, 7, 9, 11
            int difference = numbers[i + 1] - numbers[i]; // 1
            if (difference != 1) {
                System.out.println("first non consecutive number : " + numbers[i + 1]);
                break;
            }
        }
    }

    private static void findNonConsecutiveUsingStream(int[] numbers) {
        Integer result = IntStream.range(1, numbers.length-1)
                .filter(x -> numbers[x - 1] + 1 != numbers[x]) // 1, 2, 3, 4, 6, 7, 9, 11
                .mapToObj(x -> numbers[x])
                .findFirst()
                .orElse(null);

        System.out.println("first non consecutive number : " + result);
    }

    private static void findNonConsecutiveUsingAtomicInteger(int[] numbers) {
        AtomicInteger a = new AtomicInteger(numbers[0]); // 1

        Integer result = Arrays.stream(numbers) // 1, 2, 3, 4, 6, 7, 9, 11
                .filter(x -> x != a.getAndIncrement())// 1, 2, 3, 4, 5
                .findFirst()
                .getAsInt();

        System.out.println("first non consecutive number : " + result);
    }
    }




