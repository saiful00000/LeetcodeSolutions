package Tree;

import java.util.List;

public class Node {
    public int val;
    public List<Node> children;

    public Node() {

    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }


}

/*class Tree {
    Node root;

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.children.add(new Node(2));
        tree.root.children.add(new Node(3));
        tree.root.children.add(new Node(4));

        Leetcode_429_N_Ary_Tree_LevelOrderTraversal let = new Leetcode_429_N_Ary_Tree_LevelOrderTraversal();
        System.out.println(let.levelOrder(tree.root));

    }
}*/
