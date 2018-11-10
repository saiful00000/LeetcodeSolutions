package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_872_Leaf_Similar_Trees {

    List<Integer> list = new ArrayList<Integer>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        getLeaf(root1);
        list1 = list;
        list = new ArrayList<>();
        getLeaf(root2);
        list2 = list;
        list = new ArrayList<>();

        System.out.println(list1);
        System.out.println(list2);

        return list1.equals(list2);
    }

    public void getLeaf(TreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null)
                list.add(root.val);

            getLeaf(root.left);
            getLeaf(root.right);
        }
    }
}
