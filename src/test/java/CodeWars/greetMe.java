package CodeWars;

import java.sql.SQLOutput;

public class greetMe {
    public static String greet(String name) {
        String name2 = name.toLowerCase();
        return "Hello " + name2.substring(0, 1).toUpperCase() + name2.substring(1);
    }

    public static String Greet(String name) {
        return String.format("Hello %s!", name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
    }





    public static void main(String[] args) {
        String name= "SSSSSSS";
        System.out.println(greet(name));
        System.out.println();
    }
}
