package Trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-bottom-left-tree-value/
public class FindBottomLeftValue {

    /*
     * Solution 1:
     * Intution: 1): helper.
     *  2) level order.
     * 3) Need to find bottom Node Not left Bottom
     *    one test case fails [0, null, -1]
     *
     * */

    List<Integer> list = new ArrayList<>();
    public int findBottomLeftValue(TreeNodes root) {
        helper(root, 0);
        return list.get(list.size()-1);
    }

    public void helper(TreeNodes node, int level) {
        if(node == null) return;

        if(level == list.size()) {
            list.add(node.val);
        }


        helper(node.left,level+1);
        helper(node.right,level+1);
    }
}
