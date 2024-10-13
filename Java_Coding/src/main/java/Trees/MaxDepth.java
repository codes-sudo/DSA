package Trees;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaxDepth {
    /*
    * Solution1:
    * Intution : use helper and depth
    *
    * */
    public int maxDepth(TreeNodes root) {
        return helper(root, 0);
    }

    public int helper(TreeNodes node, int depth) {
        if(node == null) return depth;

        int left = helper(node.left, depth+1);
        int right = helper(node.right, depth+1);
        return Math.max(left, right);
    }

    public int maxDepth1(TreeNodes root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth1(root.left), maxDepth1(root.right));
    }
}

