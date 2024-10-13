package BinarySearch;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotated {

    /*
    * Solution:
    * Intution:
    * first find sorted area then in that check with target and mid
     * second check between mid && and high
     * check target is between low and mid
    * */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right) {
            int mid = (right+left) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[left] <= nums[mid]) {
                if(target <= nums[mid] && nums[left] <= target) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            } else {
                if(target >= nums[mid] && nums[right] >= target) {
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
        }

        return -1;
    }
}
