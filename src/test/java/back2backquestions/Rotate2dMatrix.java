package back2backquestions;
/*
Given a two-dimensional square matrix (n x n),
rotate the matrix 90 degrees to the right (clockwise).
Input:
[
  [10, 20],
  [30, 40]
],

Output:
[
 [30, 10],
 [40, 20]
]

 */

import java.util.Arrays;

public class Rotate2dMatrix {
    public  static int[][] rotate(int[][] matrix) {
        int N = matrix.length;
        // step number 1 we need convert rows into columns
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int temp = matrix[i][j] = matrix[j][i];
                matrix[i][j] = matrix[j][i];
                // this step  we do not want swipe twice
                matrix[j][i] = temp;
            }
        }
        // step 2 swap inside each row , flip horrizontally

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (N/2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j];
                // this step  we do not want swipe twice
                matrix[i][N-1-j] = temp;
            }
        }

     return matrix;
    }

    public static void main(String[] args) {
        int matrix_given[][] = {{1,2,3},{4,5,6}};
        System.out.println("INPUT ");
        System.out.println(Arrays.deepToString(matrix_given));



        for (int i = 0; i < matrix_given.length; i++) {
            for (int j = 0; j < (matrix_given.length/2); j++) {
                int temp = matrix_given[i][j];
                matrix_given[i][j] =matrix_given[i][matrix_given.length-1-j];
                // this step  we do not want swipe twice
                matrix_given[i][matrix_given.length-1-j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix_given));

//
//        System.out.print(Arrays.deepToString(matrix_given));
//        System.out.println();
//        System.out.println("oout put"+ Arrays.deepToString(rotate(matrix_given)));
//

    }
}
