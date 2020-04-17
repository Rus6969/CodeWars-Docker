package CodeWars;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class missingLetter {
    public static char findMissingLetter(char[] array) {
        char expectedLetter = array[0];
        for (char letter : array) {
            if (letter != expectedLetter)
                break;
            expectedLetter++;
        }
        return expectedLetter;
    }

    @Test
    public void exampleTests() {
        assertEquals('e', findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'}));
        assertEquals('P', findMissingLetter(new char[]{'O', 'Q', 'R', 'S'}));
    }
}
