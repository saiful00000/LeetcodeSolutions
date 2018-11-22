package Tree;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_530_Minimum_Absolute_Difference_in_BST {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        inOrder(root, list);

        for (int i = 0; i < list.size()-1; i++) {
            minDiff = Math.min(minDiff, list.get(i+1) - list.get(i));
        }
        return minDiff;
    }

    public void inOrder(TreeNode root, List<Integer> list){
        if (root == null)
            return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}
