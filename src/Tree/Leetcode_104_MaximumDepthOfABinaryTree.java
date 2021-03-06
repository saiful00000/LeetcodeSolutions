package Tree;

public class Leetcode_104_MaximumDepthOfABinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        if (root.left == null)
            return maxDepth(root.right) + 1;
        if (root.right == null)
            return maxDepth(root.left) + 1;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
