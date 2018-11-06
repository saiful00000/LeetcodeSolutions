package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_Inver_Binary_Tree {

    //
    TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode l = invertTree(root.left);
        TreeNode r = invertTree(root.right);
        root.left = r;
        root.right = l;

        return root;
    }

    class IterativeSolution{
        TreeNode invertTree(TreeNode root) {
            if (root == null) return null;

            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode current = queue.poll();
                TreeNode tempo = current.left;
                current.left = current.right;
                current.right = tempo;

                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
            return root;
        }
    }
}
