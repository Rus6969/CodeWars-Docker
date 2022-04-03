package interviewQuestions.Tala;

public class MostConsecutiveCharacterInString {
    public static void main(String[] args) {
        String word = "aabbcyyyy";
       System.out.println(findMostConsecutive(word));


    }

    static char findMostConsecutive(String text) {
        int count = 0;
        int currentCount = 1;
        char result =text.charAt(0);
        for (int i = 0; i < text.length(); i++) {
            if (i < text.length() - 1 && text.charAt(i) == text.charAt(i + 1))
                currentCount++;
            else {
                if (currentCount>count) {
                    count = currentCount;
                    result = text.charAt(i);
                }
                currentCount = 1;
            }

        }

        return result;
    }

}



