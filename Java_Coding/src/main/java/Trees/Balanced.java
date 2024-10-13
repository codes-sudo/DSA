package Trees;

// https://leetcode.com/problems/balanced-binary-tree/
public class Balanced {
    /*
      A height-balanced binary tree is a binary tree
        in which the depth of the two subtrees of every node never differs by more than one.
     * Solution : 1
     * Intutuion:
        1. result
        2. 1+ Math.max(right, left);
     *
     * */
    private boolean result = true;
    public boolean isBalanced(TreeNodes root) {
        if(root == null) return true;

        helper(root);
        return result;
    }

    public int helper(TreeNodes node) {
        if(node == null) return 0;

        int left = helper(node.left);
        int right = helper(node.right);
        if(Math.abs(left - right) > 1) {
            result = false;
        }

        return  1+ Math.max(right, left);

    }
}




