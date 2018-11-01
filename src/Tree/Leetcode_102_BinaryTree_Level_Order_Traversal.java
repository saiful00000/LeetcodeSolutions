package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_102_BinaryTree_Level_Order_Traversal {

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
        return bigList;
    }
}
