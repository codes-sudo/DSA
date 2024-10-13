package Trees;

public class SortedArrayToBST {

        /*
         * Solution1:
         * Intution: use helper with mid point
         *
         *
         * */
        public TreeNodes sortedArrayToBST(int[] nums) {
            return helper(0, nums.length-1, nums);
        }

        public TreeNodes helper(int left, int right, int[] nums) {
            if(left > right) return null;
            int mid = (right + left) /2;
            TreeNodes node = new TreeNodes(nums[mid]);
            node.left = helper(left, mid-1,  nums);
            node.right = helper(mid+1, right,  nums);
            return node;
        }

}
