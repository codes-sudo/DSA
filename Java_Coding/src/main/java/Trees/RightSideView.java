package Trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-right-side-view/
public class RightSideView {

    /*
    * Solution 1:
    * Intution: 1). Right side of a tree if right side is null then right side of left side
    * 2). Last Node at Every Level is my Right Side View
    * 3) Need to perform Level order
    *  4) right helper to call first if it's null will not insert
    *  and to not add left if right is present do level order
    *
    * */
    List<Integer> list = new ArrayList<>();
    public List<Integer> rightSideView(TreeNodes root) {
        helper(root, 0);
        return list;
    }

    public void helper(TreeNodes node, int level) {
        if(node == null) return;

        /*@ level it will add only 1 element*/
        if(level == list.size()) {
            list.add(node.val);
        }


        helper(node.right, level+1);
        helper(node.left, level+1);
    }
}
