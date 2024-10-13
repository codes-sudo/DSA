package Trees;

public class DistributeCoins {

    /*

     * Solution : 1
     * Intutuion:
        1 Use Postorder
        critical point:
     *
     * */
    int moves = 0;
    public int distributeCoins(TreeNodes root) {
        helper(root);
        return moves;
    }

    private int helper(TreeNodes node) {
        int left = helper(node.left);
        int right = helper(node.right);
        moves += Math.abs(left) + Math.abs(right);

        return node.val + left + right -1;
    }
}
