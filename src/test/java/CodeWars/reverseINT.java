package CodeWars;

public class reverseINT {
    public static int Reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int temporary = num % 10;//5
            reversed= reversed*10+temporary;//5
            num/=10;//12344

        }
        return reversed;

    }


    public static void main(String[] args) {
        int dima =3565785;

        System.out.println(Reverse(dima));
    }
}
