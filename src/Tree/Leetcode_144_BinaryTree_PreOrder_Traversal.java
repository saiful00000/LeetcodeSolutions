package Tree;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_144_BinaryTree_PreOrder_Traversal {
    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();

        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return list;
    }
}
