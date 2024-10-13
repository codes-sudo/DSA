package Trees;

// https://leetcode.com/problems/path-sum/
public class HasPathSum {

    /*
    * Solution1:
    * Intution: root-to-leaf Not a single node
     * No helper Neede directly target - node.val
    *
    * */
    public boolean hasPathSum(TreeNodes root, int targetSum) {
        if(root == null) return false;

        if(root.left == null && root.right == null && targetSum - root.val == 0) {
            return true;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }


}
