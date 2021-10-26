package SearchingAlgorithms;
//similar to Binary search but we devide in 3 parts not 2
// performance log3 n slower makes to much comparisons
public class TernarySearch {
    public static int ternarySearch(int[] array,int data){
        return ternarySearch(array,data,0, array.length-1);
    }
    public static int ternarySearch(int[] array,int data,int left ,int right){
        if (right<left) return -1;// Base Condition, termination
        int partition=(right-left)/3;
        int middle1=left+partition;
        int middle2=right-partition;

        if(array[middle1]==data) return middle1;
        if(array[middle2]==data) return middle2;

        if(data<array[middle1]) return ternarySearch(array, data,left,middle1-1);
        if(data>array[middle2]) return ternarySearch(array, data,middle2+1,right);

        return ternarySearch(array, data,middle1+1,middle2-1);//middle partition
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(ternarySearch(arr,4));
    }


}
