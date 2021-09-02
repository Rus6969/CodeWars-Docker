package FunctionalInterfaces;

import java.util.*;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {
/// predicate take different datatype but returns boolean
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> {
            if (number % 2 == 0)
                return true;
            return false;
        };

        System.out.println(isEven.test(20));
        System.out.println("-*-**/*-/-*/-*/-*/-*/-*/-*/-/-*/-*/");

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "Java", "Inna"));

        Predicate<String> isUnique = p -> Collections.frequency(list, p) == 1;

        System.out.println(isUnique.test("Java"));
        //remove less 30 will not renove
        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 30, 30, 40, 40, 50, 60, 70, 80));

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 40) {
                nums.remove(i);
            }
        }

        System.out.println(nums);

        System.out.println("-----------------------------------------------------------");
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 30, 30, 40, 40, 50, 60, 70, 80));

        Iterator<Integer> iterator = nums2.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 40) {
                iterator.remove();
            }
        }

        System.out.println(nums2);

        System.out.println("----------------------------------------------------------");
        // removeIf()
        List<Integer> nums3 = new ArrayList<>(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 30, 30, 40, 40, 50, 60, 70, 80));
        // Predicate<Integer> lessThan40 = p -> p < 40;

        nums3.removeIf(p -> p < 40);

        System.out.println(nums3);

    }
    }
