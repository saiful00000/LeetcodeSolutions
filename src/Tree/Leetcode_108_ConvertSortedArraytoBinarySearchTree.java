package Tree;

public class Leetcode_108_ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;

        return helper(nums, 0, nums.length-1);
    }

    public TreeNode helper(int[] nums, int s, int e) {
        if(s > e) return null;

        int mid = s + (e - s) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums, s, mid-1);
        root.right = helper(nums, mid+1, e);

        return root;
    }
}
