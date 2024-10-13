package Trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-level-order-traversal/
public class LevelOrder {

    /*
    * Solution 1:
    * Intution:
    *
    * */
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNodes root) {
        helper(root, 0);
        return list;
    }

    public void helper(TreeNodes node, int depth) {
        if(node == null) return;

        if(depth >= list.size()) {
            list.add(new ArrayList<>());
        }

        list.get(depth).add(node.val);

        helper(node.left, depth+1);
        helper(node.right, depth+1);
    }
}
