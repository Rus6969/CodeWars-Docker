package interviewQuestions.Tesla;

import java.util.*;
import java.util.function.BiFunction;

/*
ScoreCount - For a given list of test cases and results,
calculate the total number of points assuming that each group of tests is worth the same number of points.
 */
public class Points_Counter {


    public static void main(String[] args) {
        int point = 2;
        BiFunction<List<String>, List<String>, Map<String, String>> addListsToMap = (x, y) -> {
            Map<String, String> map = new LinkedHashMap<>();
            for (int i = 0; i < x.size(); i++)
                map.put(x.get(i), y.get(i));

            return map;
        };
        ArrayList<String> tests = new ArrayList<>();
        tests.addAll(Arrays.asList("UI", "API", "Performance"));

        ArrayList<String> results = new ArrayList<>();
        results.addAll(Arrays.asList("passed", "passed", "passed"));


        Map<String, String> COUNT = addListsToMap.apply(tests, results);


        int totalPoint = COUNT.size() * point;


        System.out.println(totalPoint);

    }
}