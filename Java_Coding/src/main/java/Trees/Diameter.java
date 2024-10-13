package Trees;

//https://leetcode.com/problems/diameter-of-binary-tree/
public class Diameter {
    // pattern
    // https://leetcode.com/problems/maximum-width-of-binary-tree/solutions/5238329/java-bfs-dfs-easy-to-understand-full-explanation/
    /*
    * Solution : 1
    * Intutuion: 1). use  Helper for add edge
    *  2) find max as well as return max edges above
    *
    * */
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNodes root) {
        helper(root);
        return diameter;
    }

    public int helper(TreeNodes root) {
        if(root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        // in the middle of find it's not return recursion process
        diameter = Math.max(left+right, diameter);
        return 1 + Math.max(left, right);
    }
}
