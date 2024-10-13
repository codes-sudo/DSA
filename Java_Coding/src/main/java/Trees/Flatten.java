package Trees;

// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
public class Flatten {

    /*
    * Solution:
    * Intution 1:
    * use pre-order traversal but how to store right part in stack or How to Attach it at the end of Recursion
    * 2) Morris Traversal
    * */
    public void flatten(TreeNodes root) {
        if(root == null) return;

        TreeNodes temp = root.right;

        root.right = root.left;
        root.left = null;

        flatten(root.right);
        flatten(temp);
    }
}
