package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_173_BinarySearchTreeIterator {
    public class BSTIterator {
        Queue<Integer> q = new LinkedList();
        public void helper(TreeNode root) {
            if (root == null)
                return;
            helper(root.left);
            q.add(root.val);
            helper(root.right);
        }
        public BSTIterator(TreeNode root) {
            helper(root);
        }
        public boolean hasNext() {
            return (!q.isEmpty());
        }
        public int next() {
            return q.poll();
        }
    }
}
