package Trees;

// https://leetcode.com/problems/same-tree/description/
public class SameTree {

    /*
    * Solution 1:
    * Intution: No helper
    *  p.val != q.val
    * */
    public boolean isSameTree(TreeNodes p, TreeNodes q) {
        if(p == null && q == null) return true;
        if(p == null || q== null) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
