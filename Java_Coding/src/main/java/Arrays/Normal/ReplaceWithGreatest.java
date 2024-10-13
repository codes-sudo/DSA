package Arrays.Normal;

//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
public class ReplaceWithGreatest {

    /*
        way 1
    *   arr = [17,18,5,4,6,1]
    *   Output: [18,6,6,6,1,-1]
    *   O(n^2) O(1)
    *
    * */
    public int[] replaceWithNextGreatest(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int largest = 0;
            for (int j = i + 1; j < nums.length; j++) {
                    largest = Math.max(nums[j], largest);

            }
            nums[i] = largest;
        }
        nums[nums.length - 1] = -1;
        return nums;
    }


    /*
    *  way 2
    *  take one more array
    * O(n) O(n)
    * */

    public int[] replaceWithNextGreatest1(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        int largest = array[n-1];

        for (int i = n-2; i >= 0; i--) {
                largest = Math.max(nums[i+1], largest);
                array[i] = largest;
        }

         return nums;
    }

    /*
    *  way 3
    *
    *
    * */
    public int[] replaceWithNextGreatest2(int[] nums) {


        return nums;
    }

}

