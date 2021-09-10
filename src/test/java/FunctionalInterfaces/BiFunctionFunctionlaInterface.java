package FunctionalInterfaces;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionFunctionlaInterface {
    public static void main(String[] args) {

        BiFunction<int[], int[], List<Integer>> addArraysToList = (a, b) ->{
            List<Integer> list =new ArrayList<>();
            for (int i : a) list.add(i);
            for (int i : b) list.add(i);
            return list;
        };

        int[] arr1 ={1,2,3,4,5};
        int[] arr2 = {6,7,8,9};
        List<Integer> nums =  addArraysToList.apply(arr1, arr2);

        System.out.println(nums);

        System.out.println("------------------------------------");

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> addListsToMap =  (x, y) ->{
            Map<String, Integer> map = new LinkedHashMap<>();
            for(int i = 0; i < x.size(); i++)
                map.put( x.get(i) , y.get(i) );

            return map;
        };

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mohammad", "Mike", "Chris", "Afrooz", "Sophiya"));

        ArrayList<Integer> salaries = new ArrayList<>();
        salaries.addAll(Arrays.asList(100000, 110000, 105000, 102000, 100000));



        Map<String, Integer> employees = addListsToMap.apply(names, salaries);
        System.out.println(employees);

        employees.forEach(  (k, v) ->{
            if(v >= 105000)
                System.out.println(k);
        }   );

        Map<String ,Integer> junkFood= new HashMap<>();
        junkFood.put("burger", 1100);
        junkFood.put("fries",900);
        junkFood.put("cheese ", 780);

        System.out.println(junkFood);
        System.out.println("___----_____----_______-----___-----______");



        List<Map.Entry<String,Integer>>sortedByValue= new LinkedList<>( junkFood.entrySet());
        //The entrySet( ) method declared by the Map interface returns a Set containing the map entries.
        // Each of these set elements is a Map.Entry object.
        /*
        Set<Map.Entry> entrySet() – Returns the Set view of the entire map.
Note : This is not a method of Map.entry interface but
it is discussed here because this method is useful while working with Map.Entry interface.
         */
        sortedByValue.sort(Map.Entry.comparingByValue());
        System.out.println("sortedByValue = " + sortedByValue);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
        sortedByValue.sort(Map.Entry.comparingByKey());
        System.out.println("sortedByValue = " + sortedByValue);




    // sort by values
      employees.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(System.out::println);


    }
}
