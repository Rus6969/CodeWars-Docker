package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sortwithNull {


    public static void main(String[] args) {

        List<Integer>Sergey=new ArrayList<Integer>(Arrays.asList(null,1,2,56,78,12,null));
        List<String>S=new ArrayList<String>(Arrays.asList("Ali","Ruslan", null,"Dima", "Olga", null));
        S.sort(Comparator.nullsLast(String::compareTo));
        System.out.println("S = " + S);


        Sergey.sort(Comparator.nullsLast(Integer::compareTo));


    }
}
