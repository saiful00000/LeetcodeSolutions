package Contests.VirtualContest_02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_02_Leetcode_513 {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) return 0;

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
            if (printQ.isEmpty())
                return list.get(0);
        }
        return 0;
    }
}
