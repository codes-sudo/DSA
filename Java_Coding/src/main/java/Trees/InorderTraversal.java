package Trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/
public class InorderTraversal {

    /*
    * Solution 1: DFS Solution
    * Intution 1:
    *  create a list
    *  and a helper function;
    *
    * */

    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNodes root) {
        helper(root);
        return list;
    }

    public void helper(TreeNodes node) {
        if (node == null) return;

        helper(node.left);
        list.add(node.val);
        helper(node.right);
    }

    /*
     * Solution 2: Recursive Solution
     * Intution 1:
     *
     *
     * */
    public List<Integer> inorderTraversal2(TreeNodes root) {

        return list;
    }


    /*
     * Solution 3: Stack Solution
     * Intution 1:
     *
     *
     * */
    public List<Integer> inorderTraversal3(TreeNodes root) {

        return list;
    }
}
