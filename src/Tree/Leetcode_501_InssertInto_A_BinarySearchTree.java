package Tree;

public class Leetcode_501_InssertInto_A_BinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }
        if (key < root.val) {
            root.left = insertIntoBST(root.left, key);
        } else {
            root.right = insertIntoBST(root.right, key);
        }
        return root;
    }
}
