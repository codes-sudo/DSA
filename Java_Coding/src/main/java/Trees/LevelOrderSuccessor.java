package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://www.geeksforgeeks.org/level-order-successor-of-a-node-in-binary-tree/
public class LevelOrderSuccessor {

    public TreeNodes getSuccesor(TreeNodes node, int key) {
        if(node == null) return null;

        Queue<TreeNodes> queue = new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty()) {
            TreeNodes current = queue.poll();

            if(current.left != null) {
                queue.offer(current.left);
            }
            if(current.right != null) {
                queue.offer(current.right);
            }

            if(current.val == key) {
                break;
            }
        }
        return queue.peek();
    }
}
