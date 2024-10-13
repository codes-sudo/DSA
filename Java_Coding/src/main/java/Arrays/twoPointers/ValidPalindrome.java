package Arrays.twoPointers;

// https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();

        for(char ch: s.toCharArray())
            if(Character.isLetterOrDigit(ch)) str.append(ch);

        int left = 0;
        int right = str.length()-1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome2(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right) {
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;

            left++;
            right--;
        }

        return true;
    }

}
