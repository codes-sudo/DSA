package Trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class kthSmallest {

    /*
    * Solution 1:
    * Intution: helper
    * use inorder and counter
    * use 2 class variables
    * 3) How to update 2 variables
    * */
    int result = 0;
    int counter = 0;
    public int kthSmallest(TreeNodes root, int k) {
        inorder(root, k);
        return result;
    }

    public void inorder(TreeNodes node, int k) {
        if(node == null) return;

        inorder(node.left, k);
        counter++;
        if(counter == k) {
            result = node.val;
            return;
        }
        inorder(node.right, k);
        return;
    }

    List<Integer> list = new ArrayList<>();
    public int kthSmallest2(TreeNodes root, int k) {
        helper(root);
        return list.get(k-1);
    }

    public void helper(TreeNodes node) {
        if(node == null) return;

        helper(node.left);
        list.add(node.val);
        helper(node.right);
    }
}


