package Tree;

public class Leetcode_538ConvertBSTtoGreaterTree {
    public TreeNode convertBST(TreeNode root) {
        if (root == null)
            return null;
        convert(root);
        return root;
    }
    TreeNode prev = null;
    public void convert(TreeNode node) {
        if (node == null)
            return;
        convert(node.right);
        if (prev != null)
            node.val += prev.val;
        prev = node;
        convert(node.left);
    }
}
