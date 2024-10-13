package Trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-preorder-traversal/
public class PreorderTraversal {

        /*
        val, Left, Root

     * Solution 1: DFS Solution
     * Intution 1:
     *  create a list
     *  and a helper function;
     *
     * */

    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNodes root) {
        helper(root);
        return list;
    }

    public void helper(TreeNodes node) {
        if (node == null) return;

        list.add(node.val);
        helper(node.left);
        helper(node.right);

    }

    /*
     * Solution 2: Recursive Solution
     * Intution 1:
     *
     *
     * */
    public List<Integer> preorderTraversal1(TreeNodes root) {

        return list;
    }


    /*
     * Solution 3: Stack Solution
     * Intution 1:
     *
     *
     * */
    public List<Integer> preorderTraversa2(TreeNodes root) {

        return list;
    }
}
