package CodeWars;


import java.util.Arrays;

/*
Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.

The input will be a lowercase string with no spaces.
 */
public class AlternateCapitalization {
    public static String[] capitalize(String s){
        String u = s.toUpperCase();
        String o = "";
        String t = "";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                o += u.charAt(i);
                t += s.charAt(i);
            }else{
                o += s.charAt(i);
                t += u.charAt(i);
            }
        }
        return new String[]{o, t};
    }
    public static String[] capitalizE(String s){
        // Gorillaz - Do Ya Thing (2010)
        String[] result = new String[2];

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++){

            if (i%2 == 0){
                sb1.append(s.toUpperCase().charAt(i));
                sb2.append(s.toLowerCase().charAt(i));
            } else {
                sb1.append(s.toLowerCase().charAt(i));
                sb2.append(s.toUpperCase().charAt(i));
            }
        }
        result[0] = sb1.toString();
        result[1] = sb2.toString();
        return result;
    }

    public static void main(String[] args) {
        String name ="Ruslan";
        String result1="";
        String result2="";
        String [] arr  = new String [2];
       String name1= name.toLowerCase();
        char [] temp = name1.toCharArray();

        for(int i=0; i<temp.length; i=i+2){
            temp[i]= Character.toUpperCase(temp[i]);
             result1=new String(temp);
        }

        System.out.println(result1);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=");

           String name2= name.toLowerCase();
        char [] temp2 = name2.toCharArray();
        for(int k=1; k<temp.length; k=k+3){
            temp2[k]= Character.toUpperCase(temp[k]);
            result2=new String(temp2);
        }
        System.out.println(result2);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-==");

       arr[0]=result1;
       arr[1]=result2;
        System.out.println(Arrays.toString(arr));






    }
}
