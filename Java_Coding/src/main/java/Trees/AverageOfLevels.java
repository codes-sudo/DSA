package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/average-of-levels-in-binary-tree/
public class AverageOfLevels {

    /*
    * Solution1:
    * Intution: using queue
    *
    * */
    public List<Double> averageOfLevels(TreeNodes root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNodes> queue = new LinkedList<>();

        if(root == null) return result;
        queue.offer(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            double averageLevel = 0;
            for(int i = 0; i < levelSize; i++) {
                TreeNodes current = queue.poll();
                averageLevel += current.val;

                if(current.left != null) {
                    queue.offer(current.left);
                }
                if(current.right != null) {
                    queue.offer(current.right);
                }
            }

            averageLevel = averageLevel / levelSize;
            result.add(averageLevel);
        }
        return result;
    }

}
