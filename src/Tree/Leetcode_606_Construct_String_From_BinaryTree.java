package Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Leetcode_606_Construct_String_From_BinaryTree {
    public String tree2str(TreeNode treeNode) {
        if (treeNode == null) return "";

        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> checker = new HashSet<>();
        StringBuilder string = new StringBuilder();

        stack.push(treeNode);
        while (!stack.isEmpty()) {
            treeNode = stack.peek();
            if (checker.contains(treeNode)) {
                string.append(")");
                stack.pop();
            } else {
                checker.add(treeNode);
                string.append("("+treeNode.val);
                if (treeNode.left == null && treeNode.right != null) {
                    string.append("()");
                }
                if (treeNode.right != null) {
                    stack.push(treeNode.right);
                }
                if (treeNode.left != null) {
                    stack.push(treeNode.left);
                }
            }
        }
        return string.substring(1,string.length()-1);
    }
}
