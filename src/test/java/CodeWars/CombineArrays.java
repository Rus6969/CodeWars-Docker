package CodeWars;




import java.util.Arrays;

public class CombineArrays {

    public static int[] twoinone(int[] array1, int[] array2) {
        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];
        /*
        The arraycopy(array1, 0, result, 0, aLen) function, in simple terms,
        tells the program to copy array1 starting from index 0 to result from index 0 to aLen.Likewise,
for arraycopy(array2, 0, result, aLen, bLen)
tells the program to copy array2 starting from index 0 to result from index aLen to bLen.
         */

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);


        return result;

    }

    public static int[] Combine2Arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int count = 0;

        for (int each : arr1) {
            arr3[count] = each;
            count++;
        }
        for (int each : arr2) {
            arr3[count] = each;
            count++;
        }
        return arr3;
    }

    public static int sumTwoArrays(int[]a, int[]b){
        int firstdlina=a.length;
        int seconddlina=b.length;
        int c[]= new int[firstdlina+seconddlina];
        int sum=0;

        System.arraycopy(a,0,c,0,firstdlina);
        System.arraycopy(b,0,c,firstdlina,seconddlina);

        for(int each: c){
            sum+=each;
        }


       return sum;
    }


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        //System.out.println(Arrays.toString(twoinone(array1,array2)));

        System.out.println(Arrays.toString(Combine2Arrays(array1,array2)));

        System.out.println(sumTwoArrays(array1,array2));




        }

    }

