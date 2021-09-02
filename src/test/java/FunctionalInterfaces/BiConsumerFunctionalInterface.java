package FunctionalInterfaces;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterface {
    public static void main(String[] args) {

        BiConsumer<String,Integer>printNtimes= (str1,num)-> {
            for (int i = 0; i <num ; i++) {
                System.out.print(str1);
            }
            System.out.println();
        };
        printNtimes.accept("'ruslan",10);
        System.out.println("=-==--==-=-=-=-=-=-=-");

        //employee name hire date

        Map<String, LocalDate>map = new LinkedHashMap<>();
        map.put("Ruslan",LocalDate.of(2019,04,23));
        map.put("Inna",LocalDate.of(2020,04,23));
        map.put("Janna",LocalDate.of(2021,04,23));
        map.put("Alex",LocalDate.of(2017,04,23));

        map.forEach((k,v)->{
        if(v.getYear()<2019){
            System.out.println(k);
        }
        });
    }
}
