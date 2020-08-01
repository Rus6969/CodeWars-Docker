package CodeWars;

import java.util.Arrays;

public class bubbleSort {

    public static int[] BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = i+1; k < arr.length; k++) {
                if (arr[i] > arr[k]) {
                    int temp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        return arr;
    }



    public static void main(String[] args) {
        int[] arr = { 9,2, 5,8,1};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static class wars {
        /*
        Normally we have firstname, middle and the last name but there may be more than one word in a name like a South Indian one.

    Similar to those kinda names we need to initialize the names.

    See the pattern below:

    initials('code wars') => returns C.Wars
    initials('Barack Hussain obama') => returns B.H.Obama
         */

            public static void printInitials(String str)
            {
                int len = str.length();

                // to remove any leading or trailing spaces
                str = str.trim();

                // to store extracted words
                String t = "";
                for (int i = 0; i < len; i++) {
                    char ch = str.charAt(i);

                    if (ch != ' ') {

                        // forming the word
                        t = t + ch;
                    }

                    // when space is encountered
                    // it means the name is completed
                    // and thereby extracted
                    else {
                        // printing the first letter
                        // of the name in capital letters
                        System.out.print(Character.toUpperCase(t.charAt(0))
                                + ". ");
                        t = "";
                    }
                }

                String temp = "";

                // for the surname, we have to print the entire
                // surname and not just the initial
                // string "t" has the surname now
                for (int j = 0; j < t.length(); j++) {

                    // first letter of surname in capital letter
                    if (j == 0)
                        temp = temp + Character.toUpperCase(t.charAt(0));

                        // rest of the letters in small
                    else
                        temp = temp + Character.toLowerCase(t.charAt(j));
                }

                // printing surname
                System.out.println(temp);
            }

            public static void main(String[] args)
            {
                String str = "ishita bhuiya Waaaaakkd";
                printInitials(str);
            }
        }
}
