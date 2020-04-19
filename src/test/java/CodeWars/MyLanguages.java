package CodeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MyLanguages {
    public static void main(String[] args) {
        /*
        You are given a dictionary/hash/object containing some languages and your
        test results in the given languages. Return the list of languages where your test score is at least 60,
        in descending order of the results.

Note: the scores will always be unique (so no duplicate values)
         */
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 10);
        map1.put("Ruby", 80);
        map1.put("Python", 65);

        ArrayList<String> result = new ArrayList<>();

        System.out.println(map1);

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (entry.getValue()>=60) {
                result.add(entry.getKey());
            }

            }
        Collections.sort(result);
        System.out.println(result);



    }
}
