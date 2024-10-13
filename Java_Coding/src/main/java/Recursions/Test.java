package Recursions;

public class Test {
    static int sum = 0;
    public static void main(String[] args) {
        int[] array = {0,1,4,5,6,12,0};
        LinearSearch obj = new LinearSearch();
        System.out.println(obj.linearSearch(array, 0));
    }

    public static void fib(int n) {
        if(n == 0) {
            return;
        }

        int x = n % 10;
        n = n /10;
        sum = sum * 10 + x;
        fib(n);
        return;
    }
}

