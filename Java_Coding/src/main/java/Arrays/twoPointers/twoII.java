package Arrays.twoPointers;

public class twoII {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left < right) {
            int sum = numbers[left] + numbers[right];

            if(sum == target) {
                return new int[]{left+1, right+1};
            } else if(sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{left, right};
    }

    /*
    *
    * Use Binary Search
    * */
    public int[] twoSum2(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;


        return new int[]{left, right};
    }
}
