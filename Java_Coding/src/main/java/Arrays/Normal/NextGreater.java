package Arrays.Normal;

//  https://leetcode.com/problems/next-greater-element-i/

import java.util.Stack;

public class NextGreater {

    /*
    * way 1
    * nums1 = [4,1,2], nums2 = [1,3,4,2]
    * [-1,3,-1]
    * */

    public int[] findNextGreater(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int next_greatest = -1;
            for (int j = i+1; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    for (int k = j+1; k < nums2.length; k++) {
                        if(nums2[k] > nums1[i]) {
                            next_greatest = Math.max(next_greatest,nums2[k]);
                            break;
                        }
                    }
                    break;
                }
            }
            nums1[i] = next_greatest;
        }
        return nums1;
    }



    /*
    * way 2
    *
    *
    * */
    public int[] findNextGreater2(int[] nums1, int[] nums2) {
        // stack
        // hashMap

        for (int i = 0; i < nums1.length; i++) {
            int next_greatest = -1;
            Stack<Integer> stack = new Stack<>();

            for (int j = 0, k = 0; k < nums2.length;) {
                if(nums1[i] == nums2[j]) {
                    stack.add(nums2[k]);
                    k++;
                } else {
                    j++;
                    k = j;
                    k++;
                }
            }
            System.out.println(stack);

            for (int j = 0; j < stack.size(); j++) {
                    int prev  = stack.peek();
                    if (prev > nums1[i]) {
                        next_greatest = Math.max(next_greatest, prev);
                    }
            }

            nums1[i] = next_greatest;
        }
        return nums1;
    }

}



