package CodeWars;

public class CreditCardMask {
    //Usually when you buy something, you're asked whether your credit card number,
    // phone number or answer to your most secret question is still correct.
    // However, since someone could look over your shoulder,
    // you don't want that shown on your screen. Instead, we mask it.
    public static void main(String[] args) {
        String acountN="12345559";
        if( acountN.length()<4){
            System.out.println(acountN);
        }else {
           String result ="";
           for (int i=0; i<acountN.length(); i++){
               if(i>=4){
                   result+="#";
               }
           }
           result+=acountN.substring(acountN.length()-4);
            System.out.println("result = " + result);
            System.out.println("ruslan is fun ");
        }
    }
}
