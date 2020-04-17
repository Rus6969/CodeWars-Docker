package CodeWars;


public class isAdigit {
    public static void main(String[] args) {
        String[] arr = { "456","Soccer", "1", "hockey",  "7373774"};
        boolean numeric = true;
        for (int i = 0; i < arr.length; i++) {
            try {
                Integer num = Integer.parseInt(arr[i]);
            } catch (NumberFormatException e) {
                numeric = false;
            }

            if (numeric) {
                System.out.println("eto chislo ");

            }
            else {
                System.out.println(" is not a number");
                numeric = true;
            }
        }
    }
}

