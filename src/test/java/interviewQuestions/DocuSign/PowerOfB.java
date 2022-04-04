package interviewQuestions.DocuSign;
/*
first round Scenarios how would you test this and that
second:
// basically if a =2  and b=3 ; return 8
 */
public class PowerOfB {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }


    static int power(int N, int P) {
        {
            if (P == 0)
                return 1;
            else
                return N * power(N, P -1);
        }
    }

    static int powrBUsingPow(int x,int y){
        return (int) Math.pow(x,y);
    }

    static int powerWithForLoop(int x,int y ){
            int pow = 1;
            for (int i = 1; i <= y; i++)
                pow *= x;
            return pow;
        }
    }

