package Tree;

public class Leetcode_654_Maximum_BinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return makeTree(nums, 0, nums.length);
    }

    public TreeNode makeTree(int[] nums, int l, int r) {
        if (l == r) return null;

        int index = max(nums, l, r);
        TreeNode tree = new TreeNode(nums[index]);
        tree.left = makeTree(nums, l, index);
        tree.right = makeTree(nums, index+1, r);
        return tree;
    }

    public int max(int[] nums, int l, int r) {
        int index = l;
        for (int i = l; i < r; i++) {
            if (nums[index] < nums[i])
                index = i;
        }
        return index;
    }
}
