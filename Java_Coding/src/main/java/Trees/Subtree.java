package Trees;

// https://leetcode.com/problems/subtree-of-another-tree/
public class Subtree {

    /*
     * Solution 1:
     * Intution: Helper to check subtree
     * if(subTree(root,subRoot)) {
            return true;
        } not if(root == subRoot)
     *
     * */
    public boolean isSubtree(TreeNodes root, TreeNodes subRoot) {
        if(root == null) return root == subRoot;
        if(subTree(root,subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean subTree(TreeNodes node, TreeNodes sub) {
        if(node == null && sub == null) return true;
        if(node == null || sub == null || sub.val != node.val) return false;

        return subTree(node.left, sub.left) && subTree(node.right, sub.right);
    }
}
