package Arrays;

import Arrays.twoPointers.ValidPalindrome;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("isPalindrome , 879879jkhjkjhj "));
        System.out.println(validPalindrome.isPalindrome(""));
        System.out.println(validPalindrome.isPalindrome("    "));
        System.out.println(validPalindrome.isPalindrome("   A man, a plan, a canal: Pana "));
    }
}

