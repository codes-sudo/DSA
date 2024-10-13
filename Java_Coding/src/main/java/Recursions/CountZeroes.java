package Recursions;

public class CountZeroes {

    public int countZeroes(int n) {

        return helper(n, 0);
    }

    public int helper(int n, int count) {
        if (n == 0) return count;
        int x = n % 10;
        if(x == 0) {
            count++;
        }
        n = n/ 10;
        return helper(n, count);
    }
}
