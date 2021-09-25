package RegularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {

    // regex are used ti find cirtain pattern in text
    /*
    .       - Any Character Except New Line
\d      - Digit (0-9)
\D      - Not a Digit (0-9)
\w      - Word Character (a-z, A-Z, 0-9, _)
\W      - Not a Word Character
\s      - Whitespace (space, tab, newline)
\S      - Not Whitespace (space, tab, newline)

\b      - Word Boundary
\B      - Not a Word Boundary
^       - Beginning of a String       called anchors
$       - End of a String

[]      - Matches Characters in brackets
[^ ]    - Matches Characters NOT in brackets
|       - Either Or
( )     - Group

Quantifiers:
*       - 0 or More
+       - 1 or More
?       - 0 or One
{3}     - Exact Number
{3,4}   - Range of Numbers (Minimum, Maximum)


#### Sample Regexs ####

[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+
     */
    public static void main(String[] args) {
        String re ="[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+";
        String text = "Russam4515_@gmail.com";
        Pattern pt = Pattern.compile(re);
        Matcher mt= pt.matcher(text);

        boolean result = mt.matches();
        System.out.println(result);
    }
}
