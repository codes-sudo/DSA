package Arrays.SlidingWindow;

// https://leetcode.com/problems/binary-subarrays-with-sum/description/
public class BinarySubArray {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            int m = 1;
            int sum = nums[i];
            for(int j = i+1; j < nums.length; j++) {
                sum += nums[j];
                m++;
            }
            if(sum == goal) {
                count++;
            }
        }
        return count;
    }
}
