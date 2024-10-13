package Recursions;

public class ProductOfDigits {

    public int productOfDigits(int n) {
        if(n < 10) return n;
        return n%10 + productOfDigits(n/10);
    }
}
