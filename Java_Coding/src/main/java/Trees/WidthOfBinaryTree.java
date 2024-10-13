package Trees;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/maximum-width-of-binary-tree/
public class WidthOfBinaryTree {

    /*
    * Solution 1:
    * Intution 1: level, position and hashmap to store leftMostPosition
    *  helper
    *
    * */
    public int widthOfBinaryTree(TreeNodes root) {

        Map<Integer, Integer> leftMostPosition = new HashMap<>();
        return helper(root, 0, 1, leftMostPosition);
    }

    private int helper(TreeNodes root, int depth, int position, Map<Integer, Integer> leftMostPosition) {
        if(root == null) return 0;

        leftMostPosition.putIfAbsent(depth, position);

        int currenWidth = position - leftMostPosition.get(depth) + 1;

        int leftWidth = helper(root.left, depth+1, 2 * position, leftMostPosition);
        int rightWidth = helper(root.right, depth+1, 2*position+1, leftMostPosition);

        return Math.max(Math.max(leftWidth, rightWidth), currenWidth);
    }
}
