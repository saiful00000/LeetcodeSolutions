package Tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_199_BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> rightView = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int data = Integer.MIN_VALUE;
            while (!q.isEmpty()) {
                data = q.peek().val;
                q2.add(q.poll());
            }
            if (data != Integer.MIN_VALUE)
                rightView.add(data);

            while (!q2.isEmpty()) {
                TreeNode temp = q2.poll();
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
        }
        return rightView;
    }
}
