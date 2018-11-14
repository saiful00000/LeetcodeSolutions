package Tree;

public class BinaryTree {
    TreeNode root;

    BinaryTree() { }

    BinaryTree(int val) {
        root = new TreeNode(val);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new TreeNode(1);
        binaryTree.root.left = new TreeNode(2);
        binaryTree.root.right = new TreeNode(3);
        //binaryTree.root.right.left = new TreeNode(15);
        //binaryTree.root.right.right = new TreeNode(7);
        binaryTree.root.left.left = new TreeNode(4);
        binaryTree.root.left.left.left = new TreeNode(45);
        //binaryTree.root.left.right = new TreeNode(200);

        Leetcode_653_TwoSum_IV__Input_Is_A_BST tree = new Leetcode_653_TwoSum_IV__Input_Is_A_BST();
        //int result = tree.largestValues(binaryTree.root);
        System.out.println(tree.findTarget(binaryTree.root, 1));
    }
}
