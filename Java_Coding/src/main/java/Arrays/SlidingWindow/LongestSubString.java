package Arrays.SlidingWindow;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        String str  = "";
        int max = 0;

        for(int j = 0; j < s.length(); j++) {
            int index = str.indexOf(s.charAt(j));
            if(index == -1) {
                str += s.charAt(j);
                max = Math.max(str.length(), max);
            } else {
                // Trick
                str = str.substring(index+1) + s.charAt(j);
            }

        }

        return max;
    }


}
