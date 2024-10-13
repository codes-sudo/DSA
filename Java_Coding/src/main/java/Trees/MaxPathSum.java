package Trees;
// https://leetcode.com/problems/binary-tree-maximum-path-sum/
public class MaxPathSum {

    /*
    * Solution1
    * Intution 1:
    * if values are -ve different condition u cannot add u just have to add 0
    *
    *
    * */
    int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNodes root) {
        helper(root);
        return result;
    }

    public int helper(TreeNodes node) {
        if(node == null) return 0;

        int left = Math.max(0,helper(node.left));
        int right = Math.max(0,helper(node.right));
        result = Math.max(left+ right+ node.val, result);
        return node.val + Math.max(left, right);
    }
}
