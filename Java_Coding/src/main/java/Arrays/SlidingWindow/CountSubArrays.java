package Arrays.SlidingWindow;

// https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/description/
public class CountSubArrays {
    public long countSubarrays(int[] nums, int k) {
        long count  = 0;
        int max = Integer.MIN_VALUE;

        for(int n: nums){
            max = Math.max(max,n);
        }

        for(int j = 0; j < nums.length; j++) {
            int counter = 0;
            if(nums[j] == max) counter++;

            for(int i = j+1; i < nums.length; i++) {
                if(nums[i] == max) {
                    counter++;
                    if(counter >= k) {
                        count++;
                    }
                }

            }

        }

        return count;
    }
}


