package Trees;

// https://leetcode.com/problems/symmetric-tree/
public class Symmetric {
    /*

     * Solution : 1
     * Intution:
     *  Use && not || with return
     * */
    private boolean result = true;
    public boolean isSymmetric(TreeNodes root) {
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNodes root1, TreeNodes root2) {
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null || root1.val != root2.val) return false;

        return helper(root1.left, root2.right) && helper(root1.right, root2.left);
    }
}

