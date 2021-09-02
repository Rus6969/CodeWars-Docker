package FunctionalInterfaces;

import java.util.function.BiPredicate;

public class BipridicateFunctionalInterface {
    public static void main(String[] args) {

        BiPredicate<int[], Integer> contains = (arr, e) -> {
            for (int each : arr)
                if (each == e)
                    return true;
            return false;
        };

    int[] array = {1, 2, 3, 4};
        System.out.println(contains.test(array,3));
}
}
