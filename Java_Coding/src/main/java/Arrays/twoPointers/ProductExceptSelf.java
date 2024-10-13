package Arrays.twoPointers;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n  = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int sum = 1;


        for (int i = 0; i < nums.length; i++) {
            leftSum[i] = sum;
            sum *= nums[i];
        }

        sum = 1;
        for (int i = n-1; i >= 0; i--) {
            rightSum[i] = sum;
            sum *= nums[i];
        }


        for (int i = 0; i < n; i++) {
            nums[i] = leftSum[i] * rightSum[i];
        }

        return nums;
    }

}
