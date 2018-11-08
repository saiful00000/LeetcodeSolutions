package Tree;

//import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Leetcode_111_Minimum_Depth_BinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null)
            return 1;
        if (root.left == null || root.right == null)
            return minDepth(root.left) + minDepth(root.right) + 1;

        return Math.min(minDepth(root.left) , minDepth(root.right)) + 1;
    }
}

