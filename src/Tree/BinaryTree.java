package Tree;

public class BinaryTree {
    TreeNode root;

    BinaryTree() { }

    BinaryTree(int val) {
        root = new TreeNode(val);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new TreeNode(3);
        binaryTree.root.left = new TreeNode(9);
        binaryTree.root.right = new TreeNode(20);
        binaryTree.root.right.left = new TreeNode(15);
        binaryTree.root.right.right = new TreeNode(7);
        binaryTree.root.left.left = new TreeNode(100);
        binaryTree.root.left.right = new TreeNode(200);

        Leetcode_111_Minimum_Depth_BinaryTree e111e = new Leetcode_111_Minimum_Depth_BinaryTree();
        int result = e111e.minDepth(binaryTree.root);
        System.out.println(result);
    }
}
