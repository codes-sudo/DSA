package Recursions;

public class LinearSearch {

    public boolean linearSearch(int[] array, int search) {

        return helper(array, search, 0);
    }

    private boolean helper(int[] array, int search, int index) {
        if(index > array.length-1) return false;
        if(array[index] == search) return true;
        return helper(array, search, index+1);
    }
}
