package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_116_PopulatingNextRightPointersinEachNode {
    class TreeLinkNode {

        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }

    }

    public class solution {
        public void connect(TreeLinkNode root) {
            if (root == null)
                return;

            Queue<TreeLinkNode> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);

            while (!queue.isEmpty()) {
                TreeLinkNode temp = queue.poll();
                if (temp != null) {
                    temp.next = queue.peek();
                    if (temp.left != null)
                        queue.add(temp.left);
                    if (temp.right != null)
                        queue.add(temp.right);
                } else {
                    if (!queue.isEmpty())
                        queue.add(null);
                }
            }
        }
    }
}
