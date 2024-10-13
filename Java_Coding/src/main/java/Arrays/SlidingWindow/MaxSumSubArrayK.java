package Arrays.SlidingWindow;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

/*
* N = 4, K = 2
Arr = [100, 200, 300, 400]
*
*
* */
public class MaxSumSubArrayK {

    public long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        // code here
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < Arr.size(); i++) {
            int m = 1;
            int sum = Arr.get(i);
            for(int j = i+1; m < K && j < Arr.size(); j++) {
                sum += Arr.get(j);
                m++;
            }
            max = Math.max(max,sum);
        }
        return max;
    }


    // sliding window
    public long maximumSumSubarray2(int K, ArrayList<Integer> Arr, int N){
        // code here
        long max = Long.MIN_VALUE;
        long sum = 0;

        for(int j = 0, i = 0; j < N; j++) {
            sum += Arr.get(j);

            if((j-i) + 1 == K) {
                max = Math.max(max,sum);
                sum -= Arr.get(i);
                i++;
            }
        }

        return max;
    }
}
