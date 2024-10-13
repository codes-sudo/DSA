package Arrays.SlidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/find-k-closest-elements/

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = arr.length-1;

        while(left <= right && k > 0) {
            int closerL = Math.abs(arr[left] - x);
            int closerR = Math.abs(arr[right] - x);

            if(closerL <= closerR) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right--;
            }
            k--;
        }

        Collections.sort(list);
        return list;
    }
}
