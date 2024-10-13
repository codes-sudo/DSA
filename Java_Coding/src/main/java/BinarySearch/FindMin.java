package BinarySearch;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMin {

    /*
    * Solution
    * Intution1:
    * Identify the sorted half
    * sorted half may or may not be the answer
    * check [1,2] ,[4,5,1,2,3]
    *  nums[low] <= nums[mid] for [2,1]
    * */
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int ans = Integer.MAX_VALUE;

        while(low <= high) {
            int mid = (high + low) / 2;

            // to capture low == mid and this is the answet that's why ==
            if(nums[low] <= nums[mid]) {
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]); // when min is mid
                high = mid-1;
            }
        }
        // or return low
        return ans;
    }
}
