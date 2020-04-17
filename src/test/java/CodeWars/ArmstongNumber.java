package CodeWars;

public class ArmstongNumber {

    public static boolean Armstrong(int num){
        int a=0,b=0;
       int c= num;

        while(num>0){
            a=num%10;//3//5/1
            num=num/10;//15//1
            b=b+(a*a*a);//27+125+1

        }
        if(c==b){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int given =153;
        System.out.println(Armstrong(given));
    }
}

