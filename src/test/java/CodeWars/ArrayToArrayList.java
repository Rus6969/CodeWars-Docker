package CodeWars;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,55,6,7};
        String[]arr2={"Dima","Inna","Alex"};

        List<Integer> transfer=new LinkedList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));

    }
}
