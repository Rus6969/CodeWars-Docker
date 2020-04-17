package CodeWars;

import org.apache.commons.collections4.iterators.ArrayIterator;

import java.util.Iterator;

public class MinimaLArray {

    public static void main(String[] args) {
        int[] arr = {10, 12, 14, 6};
        int numberOfoperations = 2;
        int temp = 0;
        Iterator<Integer> iterator = new ArrayIterator<Integer>(arr);
        for (int i = 0; i < numberOfoperations; i++) {
            while (iterator.hasNext()) {

                temp += iterator.next() / 2;

            }
            System.out.println(temp);
           if(i!=numberOfoperations-1){
               temp=0;
           }
            System.out.println(temp);
        }

        System.out.println(iterator.next().toString());
    }

}

