package CodeWars;

public class Social_secNumb {
    public static void main(String[] args) {
        String socialSec="789456123";
        if(socialSec.length()<4){
            System.out.println(socialSec);
        }else {
            String result ="";
            for(int i=0; i<socialSec.length();i++){
                if(i>=4){
                    result+="#";
                }
            }
            result+=socialSec.substring(socialSec.length()-4);
            System.out.println(result);
        }
    }
}
