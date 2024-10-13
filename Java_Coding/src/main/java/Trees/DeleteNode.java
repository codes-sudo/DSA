package Trees;

// https://leetcode.com/problems/delete-node-in-a-bst/
public class DeleteNode {

    /*
    * Solution 1:
    * Intution 1:
    *
    *
    * */
    TreeNodes prev = null;
    public TreeNodes deleteNode(TreeNodes root, int key) {
        TreeNodes prev = root;
        helper(root, prev, key);
        return root;
    }

    private TreeNodes helper(TreeNodes root, TreeNodes prev, int key) {
        if(root.val == key) {
            return root;
        } else {
            prev = root;
            helper(root.left, prev, key);
            helper(root.right, prev, key);
        }
        return root;
    }

}
