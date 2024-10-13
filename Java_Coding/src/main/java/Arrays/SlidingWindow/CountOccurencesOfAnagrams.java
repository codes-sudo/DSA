package Arrays.SlidingWindow;


/*
*
* txt = forxxorfxdofr
    pat = for
    Output: 3
*
*
*
* */
public class CountOccurencesOfAnagrams {

    int search(String pat, String txt) {
        // code here
        int n = pat.length();
        int[] freq = new int[26];
        int count = 0;
        for(int j = 0, i = 0; j < txt.length(); j++) {

            freq[txt.charAt(j) - 'a']++;
            if((j-i)+1 == n) {

                for(char ch: pat.toCharArray()) {
                    freq[ch - 'a']--;
                }

                Boolean isAnagram = true;
                for (int k = 0; k < 26; k++) {
                    if(freq[k] > 0) {
                        isAnagram = false;
                        break;
                    }
                }

                if(isAnagram) count++;
                freq = new int[26];
                i++;
                freq[txt.charAt(i) - 'a']++;
            }

        }

        return count;
    }
}
