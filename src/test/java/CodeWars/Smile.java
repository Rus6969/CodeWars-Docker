package CodeWars;

public class Smile {
    public static void main(String[] args) {
        String [] arr ={":)",";(",";}",":-D"};
        int count =0;
         for(String each: arr){
             if (each.contains(":")||each.contains(";") && each.contains(")")||each.contains("D")){
                 count++;
             }
         }
        System.out.println("Number of smiles " + count);
    }
}
/*
mike wrote his code
 */