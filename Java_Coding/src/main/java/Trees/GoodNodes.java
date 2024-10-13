package Trees;

// https://leetcode.com/problems/count-good-nodes-in-binary-tree/
public class GoodNodes {

    /*
    * Solution 1:
    * Intution :
    * helper, class member variable
    * count total number of nodes not chain
    * critical [3,1,3]path
    * */

    int count = 1;
    public int goodNodes(TreeNodes root) {
        helper(root, root.val);
        return count;
    }

    public void helper(TreeNodes node, int max) {
        if(node == null) return;

        int maxLeft = max;
        int maxRight = max;
        if(node.left != null && node.left.val >= max) {
            count++;
            maxLeft = node.left.val;
        }

        if(node.right != null && node.right.val >= max) {
            count++;
            maxRight = node.right.val;
        }

        helper(node.left, maxLeft);
        helper(node.right, maxRight);
    }
}
