package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode_589_N_Array_Tree_PreOrder_Traversal {
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        List<Integer> ans = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();

        stack.push(root);

        while (!stack.isEmpty()) {
            Node temp = stack.peek();
            ans.add(temp.val);
            stack.pop();
            for (int i = 0; i < temp.children.size(); i++) {
                stack.push(temp.children.get(i));
            }
        }
        return ans;
    }
}
