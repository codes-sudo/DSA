package Stacks;

import java.util.Stack;

// https://leetcode.com/problems/evaluate-reverse-polish-notation/
public class ReversePolishNotation {

    /*
    * Solution 1
    * Intution 1:
    *  2 prblme - and /
    *
    * */
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        int counter = 0;
        for(int i = 0; i < tokens.length; i++) {
            String str = tokens[i];
            if(counter > 1 && str.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
            } else if(counter > 1 && str.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a - b);
            } else if(counter > 1 && str.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);

            } else if(counter > 1 && str.equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a * b);
            } else {
                stack.push(Integer.parseInt(str));
                counter++;
            }
        }
        return stack.pop();
    }
}
