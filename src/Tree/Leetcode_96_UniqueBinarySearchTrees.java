package Tree;

public class Leetcode_96_UniqueBinarySearchTrees {
    public int numTrees(int n) {
        long total = 1;
        for (int i = 0; i < n; i++) {
            total = total * 2 * (2 * i +1) / (i + 2);
        }

        return (int ) total;
    }

    public static void main(String[] args) {
        Leetcode_96_UniqueBinarySearchTrees ob = new Leetcode_96_UniqueBinarySearchTrees();
        System.out.println(ob.numTrees(3));
    }
}
