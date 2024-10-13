package Trees;

// https://leetcode.com/problems/convert-bst-to-greater-tree/
public class ConvertBST {

    /*
    * Solution 1
    * Intution: inorder Reverse
    *
    * */
    public TreeNodes convertBST(TreeNodes root) {
        helper(root);
        return root;
    }

    public int helper(TreeNodes node) {
        if(node == null) return 0;

        int right = helper(node.right);
        int left = helper(node.left);

        return node.val + left + right;
    }
}
