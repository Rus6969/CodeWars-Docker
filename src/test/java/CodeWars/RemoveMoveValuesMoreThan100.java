package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveMoveValuesMoreThan100 {
    public static ArrayList<Integer> remValue(ArrayList<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
            if (it.next() > 100) {
                it.remove();
            }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 444, 5, 667, 6785, 6, 344, 123));
        System.out.println("remValue(list2) = " + remValue(list2));



    }

}
