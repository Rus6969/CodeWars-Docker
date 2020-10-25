package CodeWars;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
For an integer k rearrange all the elements of the given array in such way, that:

all elements that are less than k are placed before elements that are not less than k;
all elements that are less than k remain in the same order with respect to each other;
all elements that are not less than k remain in the same order with respect to each other.

For k = 6 and elements = [6, 4, 10, 10, 6], the output should be splitByValue(k, elements) = [4, 6, 10, 10, 6].

For k = 5 and elements = [1, 3, 5, 7, 6, 4, 2], the output should be splitByValue(k, elements) = [1, 3, 4, 2, 5, 7, 6].
 */
public class Split_By_Value {

    int[] splitByValue2(int k, int[] elements) {
        int[] result = new int[elements.length];
        int i = 0;
        for (int n: elements)
            if (n < k)
                result[i++] = n;
        for (int n: elements)
            if (n >= k)
                result[i++] = n;
        return result;
    }

    int[] splitByValue(int k, int[] elements) {
        int[] array = new int[elements.length];
        int right = 0;
        int left = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (elements[i] < k) {
                array[right++] = elements[i];
            }
            if (elements[elements.length - 1 - i] >= k) {
                array[left--] = elements[elements.length - 1 - i];
            }
        }
        return array;

    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5, 8, 34, 0};
        int k = 3;

        Split_By_Value sv = new Split_By_Value();

        System.out.println(Arrays.toString(sv.splitByValue(k,arr)));

            }
        }



