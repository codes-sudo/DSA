package Recursions;

public class FindArrayIsSorted {

    public boolean isArraySorted(int[] array) {

        return helper(array, 1);
    }

    private boolean helper(int[] array, int i) {
        if(array.length-1 <= 1 || i >= array.length) return true;

        if(array[i] > array[i-1]) {
            return helper(array, i+1);
        }

        return false;
    }
}
