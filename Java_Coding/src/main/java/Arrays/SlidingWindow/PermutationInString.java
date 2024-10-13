package Arrays.SlidingWindow;

// https://leetcode.com/problems/permutation-in-string/
public class PermutationInString {

    /*
    *
    *    s1 =
        "hello"
        s2 =
        "ooolleoooleh"
    *
    * */
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int n = s1.length();

        // for(char ch: s1.toCharArray()) freq[ch-'a']++;

        for(int i = 0, j = 0; j < s2.length(); j++) {
            freq[s2.charAt(j) - 'a']++;

            if((j-i)+1 == n) {
                Boolean flag = true;
                String temp = s2.substring(i,j+1);
                for(int m = 0; m < s1.length(); m++) {
                    if(temp.indexOf(s1.charAt(m)) == -1) {
                        flag = false;
                        i++;
                        break;
                    }
                }

                if(flag) return true;
            }
        }

        return false;
    }
}
