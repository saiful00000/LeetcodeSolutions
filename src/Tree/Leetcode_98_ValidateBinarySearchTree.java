package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_98_ValidateBinarySearchTree {

    ArrayList<Integer> list = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) < list.get(i) && max < list.get(i)) {
                if (max < list.get(i - 1)) {
                    max = list.get(i-1);
                }
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public void helper(TreeNode root) {
        if (root.left != null) {
            helper(root.left);
        }

        list.add(root.val);

        if (root.right != null) {
            helper(root.right);
        }
    }
}
