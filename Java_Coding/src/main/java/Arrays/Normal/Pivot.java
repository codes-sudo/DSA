package Arrays.Normal;


//https://leetcode.com/problems/find-pivot-index/description/
public class Pivot {

    // way 1
    public int findPivot(int[] nums) {

        int pivot = -1;
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int sum = 0;


        for(int i =0; i < nums.length; i++) {
            leftSum[i] = sum;
            sum += nums[i];
        }

        sum = 0;
        for(int i =nums.length-1; i >= 0; i--) {
            rightSum[i] = sum;
            sum += nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            if(leftSum[i] == rightSum[i]) {
                pivot = i;
                return pivot;
            }
        }

        return pivot;
    }

    // way 2
    public int findPivot2(int[] nums) {
        int pivot = 0;

        return pivot;
    }
}
