package SearchingAlgorithms;

public class ExponentialSearch {
    public static int exponentialSearch(int[]array,int data){
        int bound =1;
        while(bound<array.length && array[bound]<data) bound*=2;
        // start point bc we do not want start search before since array[bound] less then data
            int left=bound/2;
//this method helpls us define the end between 2 bound and arraylentg we do not want exceed it
            int right = Math.min(bound,array.length-1);
            // here we are calling binary search
            return BinarySearch.binarySearchRec(array,data,left,right);

    }
    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        System.out.println(exponentialSearch(arr,1 ));
    }
}
