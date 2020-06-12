package CodeWars;

public class sumOfNumbers {
    public int GetSum(int a, int b)
    {
        if(a==b){
            return a;
        }else{
            return a+b;
        }
    }

    public static void main(String[] args) {
        int x=-9;
        int y=2;
        sumOfNumbers f=new sumOfNumbers();
        System.out.println(f.GetSum(x, y));
    }
}

/*
Given two integers a and b, which can be positive or negative,
find the sum of all the numbers between including them too and return it. If the two numbers are equal return a or b.

Note: a and b are not ordered!
 */