package CodeWars;

public class Likes {
    public static void main(String[] args) {
        String [] arr={"Miho","Rus"};
        if(arr.length==0){
            System.out.println("must be 'no one likes this'");

        } else if (arr.length==1){
            System.out.println("must be '"+arr[0]+" likes this'");

        } else if (arr.length==2){
            System.out.println("must be '"+arr[0]+" and "+arr[1]+" like this'");
        }


    }
}
