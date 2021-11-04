package interviewQuestions;
/*
An array is monotonic if it is either monotone increasing or monotone decreasing.
An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if
for all i <= j, A[i] >= A[j].
A monotonic array is an array where elements are either sorted in increasing order or in decreasing order.
If the array is sorted in increasing order then for an array arr[], arr[i]<=arr[i+1].
For an array sorted in decreasing order, arr[i]>=arr[i+1].
The function should return true only when the array is monotonic.
 */
public class MonotonicArray {
    public static boolean isMonotonic(int[] arr) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) increasing = false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) decreasing = false;

        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr2[]={5,4,3,2,1};
        int arr3[]={5,4,4,4,3,2,1};
        int arr4[]={8,9,78,-2,3,2,1};

        System.out.println(isMonotonic(arr3));
    }
}
