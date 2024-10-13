package Arrays.twoPointers;

public class StringBalanced {
    public int minSwaps(String s) {
        int swaps = 0;
        char[] ch = s.toCharArray();
        int closed = 0, open = 0;
        int left = 0;
        int right = s.length()-1;

        while(left < right) {
            if(ch[left] == ']' && ch[right] == '[' && left+1 < right) {
                left++;
                right--;
                swaps++;
            } if(closed > open) {

            } else if(ch[left] == ']'){
                closed++;
                right--;
                left++;
            } else if(ch[right] == '['){
                open++;
                left++;
                right--;
            }
        }

        return swaps;
    }
}
