package Trees;

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
public class LowestCommonAncestor {

    /*
    * Solution 1:
    * Intution : No helper Needed just if and else conditions with >=, <=
    *       if(p.val < root.val && q.val > root.val) return root; critical when  p.val == root.val
    * */
    public TreeNodes lowestCommonAncestor(TreeNodes root, TreeNodes p, TreeNodes q) {
        if(p.val < root.val && q.val > root.val) return root;

        if(p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if(p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }

    }
}
