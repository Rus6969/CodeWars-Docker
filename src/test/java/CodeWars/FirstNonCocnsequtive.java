package CodeWars;

public class FirstNonCocnsequtive {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,5,6,7};
        System.out.println(find(arr));
    }

    static Integer find(final int[] array) {
        for(int i=0;i<array.length-1;i++)
        {
            if ((array[i]+ 1)!= array[i + 1])
                return array[i + 1];
        }
        return null;
    }
}

