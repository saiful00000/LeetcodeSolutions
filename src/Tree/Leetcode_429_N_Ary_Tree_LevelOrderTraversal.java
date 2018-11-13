package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_429_N_Ary_Tree_LevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();

        Queue<Node> parent = new LinkedList<>();
        Queue<Node> level = new LinkedList<>();

        parent.add(root);

        while (!parent.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            while (!parent.isEmpty()) {
                level.add(parent.poll());
            }

            while (!level.isEmpty()) {
                Node temp = level.poll();
                levelList.add(temp.val);

                for (Node nd : temp.children) {
                    parent.add(nd);
                }
            }
            resultList.add(levelList);
        }
        return resultList;
    }
}
