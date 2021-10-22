package SearchingAlgorithms;

public class LinerSearch {
    public static int findAData(int array[], int data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                return i;

            } else {

            }

        }
        return -1;
    }

    public static void main(String[] args) {
         int arr []={1,2,3,4,5};
        System.out.println(findAData(arr,3 ));
    }

}
