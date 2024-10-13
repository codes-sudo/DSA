package Trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
public class ZigzagLevelOrder {


    /*
    * Solution 1:
    * Intution : helper + depth
    *  critical point : when to change direction?
    *  depth % 2 == 0
    *  if(depth % 2 != 0) {
            list.get(depth).add(node.val);
        } else {
             list.get(depth).add(0,node.val);
        }
    *
    * */
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNodes root) {
        helper(root, 0);
        return list;
    }

    public void helper(TreeNodes node, int depth) {
        if(node == null) return;

        if(depth == list.size()) {
            list.add(new ArrayList<>());
        }

        if(depth % 2 != 0) {
            list.get(depth).add(node.val);
        } else {
            list.get(depth).add(0,node.val);
        }
        helper(node.right, depth+1);
        helper(node.left, depth+1);

    }
}
