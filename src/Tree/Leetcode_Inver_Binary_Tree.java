package Tree;

public class Leetcode_Inver_Binary_Tree {
    TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode l = invertTree(root.left);
        TreeNode r = invertTree(root.right);
        root.left = r;
        root.right = l;

        return root;
    }
}
