package interviewQuestions.Tesla;

public class FindSomeOfNWhichGives0 {
    // Find N distinct integers with zero sum: Given an integer N, our task is to print N distinct numbers such that their sum is 0.

    static void findNumbers(int N)
    {
        for (int i = 1; i <= N / 2; i++)
        {
            // Print 2 symmetric numbers
            System.out.print(i + ", " + -i + ", ");
        }

        // Print a extra 0 if N is odd
        if (N % 2 == 1)
            System.out.print(0);
    }

    // Driver code
    public static void main(String[] args)
    {
        int N = 3;
        findNumbers(N);
    }
}


