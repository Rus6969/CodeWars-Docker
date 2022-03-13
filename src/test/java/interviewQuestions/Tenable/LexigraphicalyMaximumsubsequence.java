package interviewQuestions.Tenable;

public class LexigraphicalyMaximumsubsequence {

    /*
    Given a string input str of length n, choose any
character that occurs at least twice and delete
any one occurrence. Repeat this until all
remaining characters are distinct. Return the
lexicographically maximum string that can be
formed this way.
Example
input str = "aabcb"
The length of the string, n= 5. Some of the strings
that can be formed are:
"acb" - delete the first occurrences of 'a' and 'b'
"abc" - delete the first occurrence of 'a' and the
second occurrence of 'b'
It can be proven that the lexicographically
maximum string that can be obtained is "acb".
Function Description
Complete the function getString in the editor
below.
getString has the following parameters:
string input_str: a string of length n
Returns
string. the result of the operations, as
described
Constraints
• input str contains only lowercase English letters
Sample Input For Custom Testing
STDIN
FUNCTION
A
abacaba
>
input_str
= "abacaba"
5
Sample Output
cba
6
Explanation
The length of the string n = 7. The strings that
can be formed are: "abc", "bca", "cab", "acb".
"ba" and "bac", The lexicographically
maximum is "cba",


     */
    static String LexicographicalMaxString(String str)
    {
        // loop to find the max lexicographic
        // substring in the substring array
        String mx = "";
        for (int i = 0; i < str.length(); ++i) {
            if (mx.compareTo(str.substring(i)) <= 0) {
                mx = str.substring(i);
            }
        }

        return mx;
    }

    public static void main(String[] args) {
        String str = "acbacbc";
        System.out.println(LexicographicalMaxString(str));
    }
    }

