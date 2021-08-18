package CodeWars;

import java.util.Arrays;

public class reverseThisThing {

   public static String reverse(String name){
       String result ="";

           for (int i=name.length()-1; i>=0;i--){
               result+=name.charAt(i);

       }
       return result;
   }

   public static String reverse2(String word){
       String result = "";
       StringBuffer stringBuffer = new StringBuffer();
       result=   stringBuffer.append(word).reverse().toString();
       return result;
   }

    public static void main(String[] args) {
       // System.out.println(reverse2("Russell tech"));
        String[] arr ={"Ruslan","Russell","Obama"};
        System.out.println(Arrays.toString(reverseInsideArray(arr)));
    }



    // String[] arrNames= { Russell, Adam, Djigurda}; "" /// llessur madA  ...

    public static String[] reverseInsideArray(String given[]){
       String firstName="";
       for(int i =0; i<given.length; i++){
          firstName= given[i];
          String second = "";
           for (int k=firstName.length()-1;k>=0; k--){
               second+=""+firstName.charAt(k);
           }
           given[i]= second;
       }
       return given;
    }

}
