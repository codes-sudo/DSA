package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/binary-tree-level-order-traversal/
public class LevelOrder {

    /*
    * Solution 1:
    * Intution:
    *
    * */
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNodes root) {
        helper(root, 0);
        return list;
    }

    public void helper(TreeNodes node, int depth) {
        if(node == null) return;

        if(depth >= list.size()) {
            list.add(new ArrayList<>());
        }

        list.get(depth).add(node.val);

        helper(node.left, depth+1);
        helper(node.right, depth+1);
    }


    /*
     * Solution 2:
     * Intution: Using queue
     *
     * */
    public List<List<Integer>> levelOrder2(TreeNodes root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNodes> queue = new LinkedList<>();

        if(root == null) return result;
        queue.offer(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < levelSize; i++) {
                TreeNodes current = queue.poll();
                list.add(current.val);

                if(current.left != null) {
                    queue.offer(current.left);
                }
                if(current.right != null) {
                    queue.offer(current.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}
