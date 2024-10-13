package Arrays.Normal;

import java.util.*;

//https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {

    /*
    * nums = [1,1,1,2,2,3], k = 2
      Output: [1,2]
    * */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[k];

        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) +1);
            }
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        for (int i = 0; i < k; i++) {
            arr[i] = getMapKey(map,list.get(list.size()- (i+1)));
            map.remove(arr[i]);
        }

        return arr;
    }

    public static<K, V> K getMapKey(Map<K,V> map, V value) {
        for (Map.Entry<K, V> entry: map.entrySet()) {
            if(entry.getValue() == value) return entry.getKey();
        }

        return null;
    }

     /*
    * nums = [1,1,1,2,2,3], k = 2
      Output: [1,2]
    * */
     public int[] topKFrequent2(int[] nums, int k) {

         return nums;
     }
}
