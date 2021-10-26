package SearchingAlgorithms;
// improvement to leaner search also worked on sorted arrays
public class JumpSearch {
    public static int jumpSearch(int[] array,int data){
        int blockSize=(int) Math.sqrt(array.length);
        int start= 0;
        // integer which keeps jumps to each block
        int next=blockSize;
                                    // next-1 blocksize each block size
        while (start<array.length && array[next-1]<data){
            start=next;
            next+=blockSize;
            if (next>array.length) next=array.length;
        }
        for (int i = start; i < next; i++) { if (array[i]==data) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(jumpSearch(arr,7));
    }


}
