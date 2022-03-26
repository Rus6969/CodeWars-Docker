package CodeWars;

public class forMike {


    private static double count_tax(double a, double b){
        double result = (a+b) * 8.75;

       return result;
    }

    public static void main(String[] args) {

        System.out.println( " massage + happy end + tax" + count_tax(75,100 ));
    }
}
