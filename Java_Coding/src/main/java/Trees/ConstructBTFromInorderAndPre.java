package Trees;

// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
public class ConstructBTFromInorderAndPre {

    /*
    * Solution 1:
    * Intution 1) use helper
     *  2) pass preStart, inStart,
     *  3) critical point
    *
    * */
    public TreeNodes buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length-1, preorder, inorder);
    }

    public TreeNodes helper(int startPre, int StartIn, int End, int[] preorder, int[] inorder) {


        TreeNodes node = new TreeNodes(preorder[startPre]);

        node.left = helper(0, 0, inorder.length-1, preorder, inorder);
        node.right = helper(0, 0, inorder.length-1, preorder, inorder);

        return node;
    }

}
