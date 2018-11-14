package Tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Leetcode_653_TwoSum_IV__Input_Is_A_BST {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null)
            return false;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Set<Integer> set = new HashSet<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (set.contains(k - currentNode.val)) {
                return true;
            } else {
                set.add(currentNode.val);
            }

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return false;
    }
}
