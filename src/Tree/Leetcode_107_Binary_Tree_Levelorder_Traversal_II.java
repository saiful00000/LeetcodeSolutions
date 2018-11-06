package Tree;

import java.util.*;

public class Leetcode_107_Binary_Tree_Levelorder_Traversal_II {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<List<Integer>>();

        List<List<Integer>> bigList = new ArrayList<List<Integer>>();
        Queue<TreeNode> nodeQ = new LinkedList<TreeNode>();
        Queue<TreeNode> printQ = new LinkedList<TreeNode>();

        printQ.add(root);
        while (!printQ.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            while (!printQ.isEmpty()) {
                nodeQ.add(printQ.poll());
            }
            while (!nodeQ.isEmpty()) {
                TreeNode temp = nodeQ.poll();
                list.add(temp.val);
                if (temp.left != null)
                    printQ.add(temp.left);
                if (temp.right != null)
                    printQ.add(temp.right);
            }
            bigList.add(list);
        }
        Collections.reverse(bigList);
        return bigList;
    }
}
