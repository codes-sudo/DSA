package BinarySearch;

// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
public class SearchInRotatedII {
    /*
     * Solution:
     * Intution:
     *  same as SearchedRotated but we have duplicates here
     * if(nums[mid] == nums[low] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }
       [3,1,2,3,3,3,3]
     * */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right) {
            int mid = (right+left) / 2;

            if(nums[mid] == target) {
                return mid;
            }


        }

        return -1;
    }
}
