package interviewQuestions;

import java.util.Stack;

public class Valid_Parantheses {

    public static void main(String[] args) {
        System.out.println(validParentheses("(())"));
    }



    public static boolean validParentheses(String parens) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parens.length(); i++) {
            Character currentCH = parens.charAt(i);
            if (currentCH == ')') {
                continue;
            }
            if (currentCH == '(') {
                //stack (((((((((
                stack.push(currentCH);

            }

            }
        for (int i =0; i< parens.length();i++) {
            Character currentCH2 = parens.charAt(i);
            if (currentCH2==')' ){
                stack.pop();
        }
            if (currentCH2!=')'){
                continue;
            }
        }
        if (stack.size() == 0) {
            return true;
        } else
            return false;
    }



}
