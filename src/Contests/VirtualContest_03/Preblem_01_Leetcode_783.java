package Contests.VirtualContest_03;

import java.util.ArrayList;
import java.util.List;

public class Preblem_01_Leetcode_783 {

    List<Integer> list = new ArrayList<>();
    public int difference(TreeNode root) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size()-1; i++) {
            min = Math.min(min,Math.abs(list.get(i) - list.get(i+1)));
        }
        return min;
    }

    public void inOrder(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }
}
