package interviewQuestions;
import java.util.Arrays;
public class totateMatrix90degreeRight {

        // In-place rotate it by 90 degrees in anti-clockwise direction
        public static void rotate(int[][] mat)
        {
            final int N = mat.length;

            // Transpose the matrix
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < i; j++) {
                    // swap mat[i][j] with mat[j][i]
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

            // swap rows
            for (int i = 0; i < N/2; i++) {
                for (int j = 0; j < N; j++) {
                    // swap mat[i][j] with mat[N-i-1][j]
                    int temp = mat[i][j];
                    mat[i][j] = mat[N-i-1][j];
                    mat[N-i-1][j] = temp;
                }
            }
        }

        public static void main(String[] args)
        {
            // N x N matrix
            int[][] mat =
                    {
                            { 1, 2, 3, },
                            { 4, 5, 6, },

                    };

            rotate(mat);

            for (int[]r: mat) {
                System.out.println(Arrays.toString(r));
            }
        }
    }

