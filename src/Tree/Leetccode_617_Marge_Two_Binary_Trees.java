package Tree;

import java.util.Stack;

public class Leetccode_617_Marge_Two_Binary_Trees {

    public TreeNode mergeTrees(TreeNode first, TreeNode second) {
        if (first == null)
            return second;

        Stack <TreeNode[]> stack = new Stack<TreeNode[]>();
        stack.push(new TreeNode[] {first,second});

        while (!stack.isEmpty()) {
            TreeNode[] temp = stack.pop();
            if (temp[0] == null || temp[1] == null)
                continue;
            temp[0].val = temp[0].val + temp[1].val;
            if (temp[0].left == null) {
                temp[0].left = temp[1].left;
            } else {
                stack.push(new TreeNode[]{temp[0].left, temp[1].left});
            }
            if (temp[0].right == null) {
                temp[0].right = temp[1].right;
            } else {
                stack.push(new TreeNode[] {temp[0].right, temp[1].right});
            }
        }
        return first;
    }
}
