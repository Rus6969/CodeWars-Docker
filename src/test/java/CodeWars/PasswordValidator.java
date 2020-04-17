package CodeWars;

public class PasswordValidator {
    public static boolean Password(String paass){
        String lowerCase= "(.*[a-z].*)";
        String upperCase="(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialchars="(.*[-/,:-@].*)";

        boolean haslower= paass.matches(lowerCase) , hasUpper = paass.matches(upperCase), hasdigits= paass.matches(numbers),
                hasspecial=paass.matches(specialchars), Valid= false;

        if(paass.length()>=6 &&!paass.contains(" ")){
            if (haslower && hasUpper && hasspecial && hasdigits){

            }
        }
        return  Valid=true;
    }

    public static void main(String[] args) {
        String parol="yyU7&rrrR";

        System.out.println("Password(parol) = " + Password(parol));
    }
}
