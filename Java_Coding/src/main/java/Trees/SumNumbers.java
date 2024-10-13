package Trees;

// https://leetcode.com/problems/sum-root-to-leaf-numbers/
public class SumNumbers {

    /*
    * Solution 1
    * Intution 1) use helper
    *  2) result
    *  3) critical @line 15 I was send root.val I shld have send 0
    *
    * */
    int result = 0;
    public int sumNumbers(TreeNodes root) {
        helper(root, 0);
        return result;
    }

    public void helper(TreeNodes node, int current) {
        if(node == null) return;

        current = (10 * current) + node.val;
        if(node.left == null && node.right == null) {
            result += current;
            return;
        }

        helper(node.left, current);
        helper(node.right, current);
        return;
    }
}
