package Tree;

public class Leetcode_687_Longest_Univalue_Path {
    int max;

    public int longestUnivaluePath(TreeNode root) {
        max = 0;
        maxDepth(root);
        return max;
    }

    public int maxDepth(TreeNode node) {
        if (node == null)
            return 0;
        int left = maxDepth(node.left);
        int right = maxDepth(node.right);
        int rightLen = 0, leftLen = 0;

        if (node.left != null && node.left.val == node.val)
            leftLen += left + 1;
        if(node.right != null && node.right.val == node.val)
            rightLen += right + 1;

        max = Math.max(max, rightLen + leftLen);

        return Math.max(rightLen, leftLen);
    }
}
