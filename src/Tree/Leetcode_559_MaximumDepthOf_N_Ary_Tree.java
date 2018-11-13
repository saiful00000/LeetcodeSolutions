package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_559_MaximumDepthOf_N_Ary_Tree {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.children.isEmpty()) {
            return 1;
        } else {
            List<Integer> paths = new ArrayList<>();
            for (Node item : root.children) {
                paths.add(maxDepth(item));
            }
            return Collections.max(paths) + 1;
        }
    }
}
