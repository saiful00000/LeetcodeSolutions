package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_515_Find_Largest_Value_In_Each_Tree_Row {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> largestList = new ArrayList<>();
        Queue<TreeNode> parent = new LinkedList<>();
        Queue<TreeNode> child = new LinkedList<>();

        parent.add(root);

        while (!parent.isEmpty()) {
            while (!parent.isEmpty()) {
                child.add(parent.poll());
            }

            int  max = Integer.MIN_VALUE;

            while (!child.isEmpty()) {
                TreeNode temp = child.poll();
                max = max < temp.val ? temp.val : max;
                if (temp.left != null) {
                    parent.add(temp.left);
                }
                if (temp.right != null) {
                    parent.add(temp.right);
                }
            }

            largestList.add(max);
        }
        return largestList;
    }
}
