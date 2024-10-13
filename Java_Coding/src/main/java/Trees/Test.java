package Trees;

public class Test {
    public static void main(String[] args) {
        Integer[] values = {3, 9, 20, null, null, 15, 7};
        TreeNodes root = TreeNodes.buildTreeFromLevelOrder(values);

        // Display the tree
        root.display();
        Balanced diameter = new Balanced();
        diameter.isBalanced(root);
    }
}
