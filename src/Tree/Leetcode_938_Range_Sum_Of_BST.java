package Tree;

public class Leetcode_938_Range_Sum_Of_BST {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        preOrder(root, L, R);
        return sum;
    }

    public void preOrder(TreeNode node, int l, int r) {
        if (node == null) return;
        if (node.val >=l && node.val <= r)
            sum += node.val;
        preOrder(node.left, l, r);
        preOrder(node.right, l, r);
    }
}
