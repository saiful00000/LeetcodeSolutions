package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_637_Average_Of_Levels_In_BinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Double> list = new ArrayList<>();
        Queue<TreeNode> node = new LinkedList<>();
        Queue<TreeNode> child = new LinkedList<>();

        node.add(root);

        while (!node.isEmpty()) {
            double sum = 0, count = 0;

            while (!node.isEmpty()) {
                child.add(node.poll());
            }
            while (!child.isEmpty()) {
                TreeNode temp = child.poll();
                sum += temp.val;
                count++;
                if (temp.left != null) {
                    node.add(temp.left);
                }
                if (temp.right != null) {
                    node.add(temp.right);
                }
            }
            if (count == 0) {
                list.add(sum);
            } else {
                list.add((sum/count));
            }
        }
        return list;
    }
}
