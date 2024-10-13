package Arrays.Normal;


import java.util.*;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class NumbersDisappeared {

    /*
    * way 1
    *
    *  nums = [4,3,2,7,8,2,3,1]
        Output: [5,6]
    * */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        for (int i=1; i <= nums.length; i++) {
            if(!set.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }


    /*
   * way 2
   *
   * */
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> list = new ArrayList<>();


        return list;
    }
}
