package CodeWars;

public class isApangram {

    //A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
    //
    //Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
    public static boolean check(String sentence ) {
        for (char c = 'a'; c <= 'z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;
    }

    public static void main(String[] args) {
        String str ="The quick brown fox jumps over the lazy dog";
        System.out.println("check(str) = " + check(str));
    }

}
