package Arrays.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++) {
            int left = i+1;
            int right = nums.length-1;

            if(i > 0 && nums[i] == nums[i-1]) continue;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    List<Integer> ll = new ArrayList<>();
                    ll.add(nums[i]);
                    ll.add(nums[left]);
                    ll.add(nums[right]);
                    list.add(ll);
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;
                    right--;
                    left++;
                } else if( sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }

        }
        return list;

    }

    public List<List<Integer>> threeSum2(int[] nums) {
        // use set which will remove 2 whiles

        return new ArrayList<>();
    }
}
