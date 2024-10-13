package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodes {


    int val;
    TreeNodes left;
    TreeNodes right;

    TreeNodes() {}

    TreeNodes(int val) {
        this.val = val;
    }

    TreeNodes(int val, TreeNodes left, TreeNodes right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // Adds a node with given data to the tree
    public TreeNodes addNode(int data, TreeNodes node) {
        if (node == null) {
            return new TreeNodes(data);
        }
        if (data < node.val) {
            node.left = addNode(data, node.left);
        } else {
            node.right = addNode(data, node.right);
        }
        return node;
    }

    // Displays the tree nodes in in-order traversal
    public void display(TreeNodes node) {
        if (node == null) return;
        display(node.left);
        System.out.println(node.val);
        display(node.right);
    }

    // Overloaded display method for convenience
    public void display() {
        display(this);
    }

    // Build a tree from level-order list
    public static TreeNodes buildTreeFromLevelOrder(Integer[] values) {
        if (values == null || values.length == 0) return null;

        TreeNodes root = new TreeNodes(values[0]);
        Queue<TreeNodes> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < values.length) {
            TreeNodes current = queue.poll();

            // Process left child
            if (values[i] != null) {
                current.left = new TreeNodes(values[i]);
                queue.add(current.left);
            }
            i++;

            // Process right child
            if (i < values.length && values[i] != null) {
                current.right = new TreeNodes(values[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }
}
