package Arrays.twoPointers;

import java.util.Stack;

// https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/description/
public class MinNoOfSwaps {
    public int minSwaps(String s) {
        int swap = 0;
        Stack<Character> stack = new Stack();
        for(char ch: s.toCharArray()) {
            if(ch == '[') {
                stack.push(ch);
            } else if(!stack.isEmpty()){
                stack.pop();
            } else {
                swap++;
            }
        }
        return (swap+1)/2;
    }
}
