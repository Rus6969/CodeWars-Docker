package interviewQuestions;
/*
options to sort not sorted array
1. hash map
2. Search tree
3. front back search and tree o(n)/2 // liner
 */ // liner seach perform better ..
public class SearchInUnsortedArray {

    public static int frontBackSearch(int[]arr,int data){
        //Start searching from both ends
        int front = 0;
        int back = arr.length-1;
        // condition
        while(front<=back){
            if(arr[front]==data) return front;
            if(arr[back]==data) return back;
            front++;
            back--;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]arr ={5,4,5,7,8,-5,9,6};

        System.out.println(frontBackSearch(arr,8));
    }
}
