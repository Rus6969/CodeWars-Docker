package CodeWars;

public class devideWithoutDevision {
    public static void Devide (int num1 , int num2){
        if(num2==0){
            System.out.println("invalid Number");
            return;
        }
        System.out.println(num1+"ndevided by "+num2+" is");

        int count =0;
        while(num1>=num2){
            num1-=num2;
            count++;
        }
        System.out.println(count+"and remider is "+num1);

    }


    public static void main(String[] args) {
        int chislo = 56;
        int chislo2= 3;
        Devide(chislo,chislo2);
    }
}

