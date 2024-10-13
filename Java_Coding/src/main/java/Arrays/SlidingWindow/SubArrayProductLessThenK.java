package Arrays.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// https://leetcode.com/problems/subarray-product-less-than-k/
public class SubArrayProductLessThenK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        Map<List<Integer>,Integer> set = new HashMap<>();

        for(int i= 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            int sum = nums[i];
            list.add(nums[i]);
            if(sum < k) {
                if(set.containsKey(list)) {
                    System.out.println(list);
                    continue;
                } else {
                    set.put(list, 1);
                    count++;
                }
            }
            for(int j = i+1; j < nums.length; j++) {
                sum *= nums[j];
                list.add(nums[j]);

                if(sum < k) {
                    if(set.containsKey(list)) {
                        System.out.println(list);
                        continue;
                    } else {
                        set.put(list, 1);
                        count++;
                    }
                } else {
                    break;
                }
            }
        }

        return count;
    }
}
