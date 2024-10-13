package Arrays.SlidingWindow;

// https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
/*
     N = 5
    A[] = {-8, 2, 3, -6, 10}
    K = 2
    Output :
    -8 0 -6 -6
* */
public class FirstNegativeIntegerInEveryWindow {

    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long[] negatives = new long[N-K+1];
        int count= 0;
        for(int j = 0, i = 0; j < N; j++) {

            boolean negativefound = false;

            if((j-i)+1 == K) {
                int m = i;
                long foundvalue = 0;
                negativefound = true;

                while(m<=j) {
                    if(A[m] < 0) {
                        foundvalue = A[m];
                        break;
                    }
                    m++;
                }
                i++;

                if(negativefound) {
                    negatives[count] = foundvalue;
                    count++;
                }

            }

        }

        return negatives;
    }



    // use boolean
    public long[] printFirstNegativeInteger2(long A[], int N, int K)
    {
        long[] negatives = new long[N-K+1];
        int count = 0;

        for(int i = 0; i <= N - K; i++){
            boolean isNegative =  true;
            for(int j = i;  (j-i) + 1 <= K;j++) {
                if(A[j] < 0) {
                    negatives[count] = A[j];
                    count++;
                    isNegative = false;
                    break;
                }
            }

            if(isNegative) {
                negatives[count] = 0;
                count++;
            }
        }
        return negatives;
    }
}
