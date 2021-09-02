package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerFunctionalInterface {
    public static void main(String[] args) {
        Consumer<String> printThreetimes = s -> System.out.println(s + s + s);

        printThreetimes.accept("Ruslan");
        System.out.println("------------------------------------");

        Consumer<List<String>> printEach = list -> {
            for (String s : list) {
                System.out.println(s + " ");
            }
            System.out.println();
        };

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ruslan", "Inna", "Vlad"));
        printEach.accept(names);
//////////////////////////////////////////////////////////////////////////////////////
        List<String> elements = new ArrayList<>();
        elements.addAll(Arrays.asList("Java", "Cyber", "Phython", "Java"));
        List<String> Duplicatedelements = new ArrayList<>();

        Predicate<String>isDuplicated= s -> Collections.frequency(elements,s)>1;
        elements.forEach(k-> {
            if(isDuplicated.test(k))
                Duplicatedelements.add(k);
        });

        System.out.println(Duplicatedelements);
    }



    //-----


}
