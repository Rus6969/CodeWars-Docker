package CodeWars;

public class RoundToNearest {
    /*
    For example:

The number 10 is given and you need to get the nearest number in this series: 1, 2, 3, 4, 6, 12. The answer should be 12.

C#

int[] intArray = new int[] {1,2,3,4,6,12};
int givenValue = 10;
     */

    public static int getClosestIndex( int[] values, int value) {
        class Closest {
            Integer dif;
            int index = -1;
        };
        Closest closest = new Closest();
        for (int i = 0; i < values.length; ++i) {
            final int dif = Math.abs(value - values[i]);
            if (closest.dif == null || dif < closest.dif) {
                closest.index = i;
                closest.dif = dif;
            }
        }
        return closest.index;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,12};
        int num=10;
        System.out.println(getClosestIndex(arr,num));
        System.out.println(arr[6]);


        }
    }


