package tree;

import java.util.List;

public class BinaryTree {
    private TreeNode tree;

    public BinaryTree(List<Integer> treeValues) {
        tree = new TreeNode();
        tree.val = treeValues.get(0);
        tree.left = new TreeNode();
        tree.right = new TreeNode();
        TreeNode leftNode = tree.left;
        TreeNode rightNode = tree.right;
        for(int i = 0; i < 2*i + 2; i++) {
            leftNode.val = 2*treeValues.get(i) + 1;
            rightNode.val = 2*treeValues.get(i) + 2;
        }
    }

    public TreeNode getRoot() {
        return tree;
    }
}

