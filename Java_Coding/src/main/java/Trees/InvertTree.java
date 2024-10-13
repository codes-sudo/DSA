package Trees;

//https://leetcode.com/problems/invert-binary-tree/
public class InvertTree {

    /*
    * Solution1: No Helper Function Needed
    * Intution: create New Node every time
    *
    *
    * */
    public TreeNodes invertTreeNode(TreeNodes root) {
        if(root == null) return root;

        TreeNodes temp = new TreeNodes(root.val);
        temp.left = invertTreeNode(root.right);
        temp.right = invertTreeNode(root.left);
        return temp;
    }


    public TreeNodes invertTree2(TreeNodes root) {
        if(root == null) return root;

        TreeNodes temp = root.left;
        root.left = invertTree2(root.right);
        root.right = invertTree2(temp);

        return root;
    }
}
