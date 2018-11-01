package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode_94_BinaryTree_inOrder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root){
        if (root == null) return new ArrayList<>();

        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp = root;

        while (stack.size() > 0 || temp != null) {

            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }

            temp = stack.pop();
            list.add(temp.val);
            temp = temp.right;
        }

        return list;
    }
}
