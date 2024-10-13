package BinarySearch;

// https://leetcode.com/problems/search-a-2d-matrix/
public class SearchMatrix {

    /*
    * Solution:
    *
    * Intution:
    * high =  r*c-1
    * convert index--> mid to 2D coordinates using index/col and index%col it gives us row and col
    *
    * */
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int low = 0;
        int high = r*c-1;

        while(low <= high) {
            int mid = (high + low) / 2;
            int mid_val = matrix[mid/c][mid%c];

            if(mid_val == target) {
                return true;
            } else if(mid_val < target){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return false;
    }

    /*
     * Solution2
     *
     *
     * */
    public boolean searchMatrix2(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] <= target && target <= matrix[i][m - 1]) {
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] nums, int target) {
        int n = nums.length; //size of the array
        int low = 0, high = n - 1;

        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return true;
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }


    /*
    * Solution3
    * */
    public boolean searchMatrix3(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
