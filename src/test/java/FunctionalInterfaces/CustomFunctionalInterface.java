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
        System.out.println("*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

// no need body {} because only one action(statement)  is taken only one parameter
        GenericDataFunction<String> reverse= s -> new StringBuilder(s).reverse().toString();
        // need body example
        GenericDataFunction<String>reverse2=(s) ->{
            String result="";
            for (int i=s.length()-1;i>=0;i--)
                result+=s.charAt(i);
            return result;
        } ;

        System.out.println(reverse.function("Ruslan"));
        System.out.println(reverse2.function("rocket"));
    }
}