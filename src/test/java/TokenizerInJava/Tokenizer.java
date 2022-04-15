package TokenizerInJava;
import java.util.*;
public class Tokenizer {
    /*
    StringTokenizer class in Java is used to break a string into tokens.
    A StringTokenizer object internally maintains a current position within the string to be tokenized.
    Some operations advance this current position past the characters processed.
    A token is returned by taking a substring of the string that was used to create the StringTokenizer object.
    https://www.geeksforgeeks.org/stringtokenizer-class-in-java/
     */
    // Java Program to Illustrate StringTokenizer Class

// Importing requieed classes


        // Main driver method
        public static void main(String args[])
        {

            // Constructor 1
            System.out.println("Using Constructor 1 - ");

            // Creating object of class inside main() method
            StringTokenizer st1 = new StringTokenizer(
                    "Hello Geeks How are you", " ");

            // Condition holds true till there is single token
            // remaining using hasMoreTokens() method
            while (st1.hasMoreTokens())

                // Getting next tokens
                System.out.println(st1.nextToken());

            // Constructor 2
            System.out.println("Using Constructor 2 - ");

            // Again creating object of class inside main()
            // method
            StringTokenizer st2 = new StringTokenizer(
                    "JAVA : Code : String", " :");

            // If tokens are present
            while (st2.hasMoreTokens())

                // Print all tokens
                System.out.println(st2.nextToken());

            // Constructor 3
            System.out.println("Using Constructor 3 - ");

            // Again creating object of class inside main()
            // method
            StringTokenizer st3 = new StringTokenizer(
                    "JAVA : Code : String", " :", true);

            while (st3.hasMoreTokens())
                System.out.println(st3.nextToken());
        }



}
