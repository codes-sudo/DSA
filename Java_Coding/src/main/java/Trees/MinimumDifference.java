package Trees;

// https://leetcode.com/problems/minimum-absolute-difference-in-bst/
public class MinimumDifference {

    Integer prev = null;
    int minDifference = Integer.MAX_VALUE;

    /*
    * Solution 1:
    * Intution: 1) use in-order traversal because This is BST we need to find diff b/w every node [L,Root, R]
    *  2) in-order traversal visits nodes in ascending order
    * 3) use helper, result,
    *
    * */
    public int getMinimumDifference(TreeNodes root) {

            helper(root);
            return minDifference;
        }

    public int helper(TreeNodes root) {
        if(root == null) return minDifference;

        getMinimumDifference(root.left);

        if(prev != null) {
            minDifference = Math.min(minDifference, Math.abs(root.val-prev));
        }
        prev = root.val;

        getMinimumDifference(root.right);

        return minDifference;
    }
}
