package Tree;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_257_BinaryTree_Paths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        paths("",root,list);
        return list;
    }

    public void paths(String s, TreeNode root, List<String> list) {
        if (root == null) return;
        if (root.left == null && root.right == null)
            list.add(s+root.val);
        paths(s + root.val + "->",root. left,list);
        paths(s + root.val + "->",root.right, list);
    }
}
