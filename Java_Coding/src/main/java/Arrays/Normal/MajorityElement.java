package Arrays.Normal;


//https://leetcode.com/problems/majority-element/description/

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    // way 1
    public int findMajority(int[] nums) {
        int len = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) > len) {
                return nums[i];
            }
        }

        return 0;
    }


    // way 2
    /*
       Moore's voting algorithm
    *  step 1) finding the candidate
    *  step 2) verifying the candidate
    *
    * */
    public int findMajority1(int[] arr) {
        int maj_idx = 0;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
             if(arr[maj_idx] == arr[i]) {
                    count++;
                } else {
                    count--;
                }

                if (count == 0) {
                    maj_idx = i;
                    count = 1;
                }
        }
        return arr[maj_idx];
    }



    /*
    * using sorting
    *
    * */
    public int findMajority3(int[] arr) {

        return 0;
    }
}
