package CodeWars;

public class FixStringCase {
    public static String fix(String str) {
        String result = "";
        boolean b;
        int uppercase = 0;
        int dlina = str.length();
        char arr[] = str.toCharArray();
        for (int i = 0; i <= arr.length; i++) {
            if (Character.isUpperCase(i)) {
                uppercase++;
            }

        }
        int lowrecase = dlina - uppercase;
        if (lowrecase >= uppercase) {
            result = str.toLowerCase();
        } else if (lowrecase < uppercase) {
            result=  str.toUpperCase();
        }

        return result;

    }

    public static void main(String[] args) {
        String str = "InnaRuslan";
        System.out.println(fix(str));
    }
}
