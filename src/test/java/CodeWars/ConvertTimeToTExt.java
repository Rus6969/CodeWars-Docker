package CodeWars;

import java.util.Scanner;

public class ConvertTimeToTExt {
     public static void printWords(int h, int m) {
        String nums[] = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one",
                "twenty two", "twenty three", "twenty four",
                "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine",
        };

        if (m == 0)
            System.out.println(nums[h] + " o' clock ");

        else if (m == 1)
            System.out.println("one minute past " +
                    nums[h]);

        else if (m == 59)
            System.out.println("one minute to " +
                    nums[(h % 12) + 1]);

        else if (m == 15)
            System.out.println("quarter past " + nums[h]);

        else if (m == 30)
            System.out.println("half past " + nums[h]);

        else if (m == 45)
            System.out.println("quarter to " +
                    nums[(h % 12) + 1]);

        else if (m <= 30)
            System.out.println(nums[m] + " minutes past " +
                    nums[h]);

        else if (m > 30)
            System.out.println(nums[60 - m] + " minutes to " +
                    nums[(h % 12) + 1]);
    }

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter your time(hour) to transfer : ");
        int h = sk.nextInt();
        System.out.println("Enter your time(minutes) to transfer : ");
        int m = sk.nextInt();


        System.out.println("your time to transfer is: " + h + " : " + m + " correct?");
        System.out.println("yes/NO");
      if (sk.nextLine().equals("NO")) {
          System.out.println("RERUN APP AGAIN ");
        } else if (sk.nextLine().equals("yes")) {
           printWords(h, m);


        }
    }
}

