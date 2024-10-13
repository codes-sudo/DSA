package Trees;

import java.util.ArrayList;
import java.util.List;


// https://leetcode.com/problems/binary-tree-postorder-traversal/
public class PostorderTraversal {

    /*
        Left Root, val

     * Solution 1: DFS Solution
     * Intution 1:
     *  create a list
     *  and a helper function;
     *
     * */

    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNodes root) {
        helper(root);
        return list;
    }

    public void helper(TreeNodes node) {
        if (node == null) return;

        helper(node.left);
        helper(node.right);
        list.add(node.val);
    }

    /*
     * Solution 2: Recursive Solution
     * Intution 1:
     *
     *
     * */
    public List<Integer> postorderTraversal2(TreeNodes root) {

        return list;
    }


    /*
     * Solution 3: Stack Solution
     * Intution 1:
     *
     *
     * */
    public List<Integer> postorderTraversal3(TreeNodes root) {

        return list;
    }
}
