package Tree;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_897_Increasing_Order_SearchTree {

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraverse(root, list);
        TreeNode result = new TreeNode(0), current = result;
        for (int value : list) {
            current.left = new TreeNode(value);
            current = current.right;
        }

        return result.right;
    }

    public void inorderTraverse(TreeNode tree, List<Integer> list) {
        if (tree == null) return;
        inorderTraverse(tree.left, list);
        list.add(tree.val);
        inorderTraverse(tree.right, list);
    }
}
