package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_563_BinaryTreeTitl {
    public int findTilt(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;

        int tilt = 0;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur_node = queue.poll();
            if (cur_node.left != null && cur_node.right != null) {
                tilt += Math.abs(cur_node.left.val - cur_node.right.val);
                queue.add(cur_node.left);
                queue.add(cur_node.right);
            } else if (cur_node.left == null && cur_node.right != null) {
                tilt += cur_node.right.val;
                queue.add(cur_node.right);
            } else if (cur_node.right == null && cur_node.left != null) {
                tilt += cur_node.left.val;
                queue.add(cur_node.left);
            }
        }
        return tilt;
    }
}
