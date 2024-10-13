package BinarySearch;

// https://leetcode.com/problems/koko-eating-bananas/
public class MinEatingSpeed {

    /*
    * Solution1:
    * Intution:
    *  critical : why totalhours <= h high = mid-1
    * */
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 1, ans = 1;

        for(int num: piles) {
            high = Math.max(high, num);
        }

        while(low <= high) {
            int mid = (high + low) / 2;
            int totalhours = 0;

            for(int num: piles) {
                totalhours += Math.ceil((double)num/mid);
            }

            if(totalhours <= h) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return ans;
    }


    /*
     * Solution2:
     * Intution:
     * BruteForce
     * */
    public int minEatingSpeed2(int[] piles, int h) {

        return 0;
    }
}
