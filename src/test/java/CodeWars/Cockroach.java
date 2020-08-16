package CodeWars;
/*
The cockroach is one of the fastest insects. Write a function which takes its speed in km per hour and returns it in cm per second, rounded down to the integer (= floored).

For example:

cockroachSpeed(1.08) == 30
Note! The input is a Real number (actual type is language dependent) and is >= 0. The result should be an Integer.
 */
public class Cockroach {
    public static int cockroachSpeed(double x){
        int y= (int) (x*27.777778);

        return y;
    }
    public int cockroachSpeed2(double kph){
        int secondsInHour = 3600;
        int cmInKm = 100000;
        int centimetresPerSecond = (int) (kph * cmInKm / secondsInHour);
        return centimetresPerSecond;
    }
    public int cockroachSpeed3(double x){
        return (int) (x * 100000)/3600;
    }

    public static void main(String[] args) {
        System.out.println(cockroachSpeed(1.8));

    }



}
