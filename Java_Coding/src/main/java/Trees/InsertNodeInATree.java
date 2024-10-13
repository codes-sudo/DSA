package Trees;

// https://leetcode.com/problems/insert-into-a-binary-search-tree/description/
public class InsertNodeInATree {

        /*
         * Solution : 1
         * Intutuion:

         *
         * */

    public TreeNodes insertIntoBST(TreeNodes root, int val) {
        if(root == null) return new TreeNodes(val);
        helper(root, val);
        return root;
    }

    public void helper(TreeNodes node, int val) {

        if(val < node.val) {
            if(node.left == null) {
                node.left = new TreeNodes(val);
                return;
            }
            helper(node.left,val);
        } else {
            if(node.right == null) {
                node.right = new TreeNodes(val);
                return;
            }
            helper(node.right, val);
        }
    }
}

