package Recursions;

public class CheckNumberIsPalindrome {

    public boolean palindrome(int n) {
        // reverse a number first
        int num = reverseANumber(n, 0);
        if(num == n) return true;
        return false;
    }

    public int reverseANumber(int n, int rev) {
        if(n == 0) return rev;

        int x = n % 10;
        n = n /10;
        rev = rev * 10 + x;
        reverseANumber(n, rev);
        return reverseANumber(n, rev);
    }
}
