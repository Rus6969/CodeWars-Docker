package CodeWars;

public class DigitalRoot {



    public static int digital_root(int n)  {

        if (n == 0) {
            return 0;
        }
        if (n % 9 == 0) {
            return 9;
        }
        return n % 9;
    }

    //Since a digital root is obtained by adding all the digits in a number, and while the resulting number is more than 9,
    // repeating the process, an alternative and equally effective approach could simply be dividing by 9.
    // In most cases, the digital root is simply the remainder of this operation.

    public static void main(String[] args) throws StackOverflowError {
      int a =9393;
        System.out.println(digital_root(a));
    }
}
