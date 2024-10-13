package Trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/minimum-distance-between-bst-nodes/
public class MinDiffInBST {

    /*
    * Solution 1
    * Intution 1: store all values in list using inorder Traversal
    * 2) then use 1 for loop for min diff
    * */
    List<Integer> inOrderList = new ArrayList<>();

    public int minDiffInBST(TreeNodes root) {
        inorder(root);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < inOrderList.size(); i++) {
            min = Math.min(inOrderList.get(i)-inOrderList.get(i-1), min);
        }

        return min;
    }

    public void inorder(TreeNodes root) {
        if(root == null) return;

        inorder(root.left);
        inOrderList.add(root.val);
        inorder(root.right);
    }
}
