package FunctionalInterfaces;

public class CustomFunctionalInterface {

    public static void main(String[] args) {
        //finding longest strin

        TwoStrings twoStrings = (str1, str2) -> {
            if (str1.length()>str2.length())
                return str1;
                return str2;
            };

        System.out.println(twoStrings.function("Java","Phyton"));
    }
}