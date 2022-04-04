package interviewQuestions.Tala;

import java.util.ArrayList;

public class FindMaxMinTimesDeltaInMultidimentionalArray {


    public static ArrayList<Integer> findDeltaAndDifference(int [][] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                sum = arr[i][j] - arr[i][j+1];
                list.add(sum);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        /*100-50
        50,
         */

        int[][] arrayTest={{100,50,25},{10,40,60}};
        System.out.println(findDeltaAndDifference(arrayTest));
    }
}
