package Arrays.SlidingWindow;


import java.util.Arrays;

// https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/
public class FrequencyOfTheMostFrequent {
    public int maxFrequency(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);


        // 1 more loop
        for(int j = nums.length-1; j >= 0; j--) {
            int last = nums[j];
            int freq = 1;
            int remaining = k;
            for(int i = j-1; i >= 0; i--) {
                if(nums[i] == last){
                    freq++;
                } else if(nums[i] + k > last & remaining == 0) {
                    remaining = (nums[i] + k) - last;
                    freq++;
                } else if(remaining + nums[i] >= last) {
                    remaining = (nums[i] + remaining) - last;
                    freq++;
                }
            }
            max = Math.max(max, freq);
        }
        return max;
    }
}
