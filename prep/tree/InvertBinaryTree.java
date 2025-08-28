package tree;

import javax.swing.tree.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        
        TreeNode temporaryLeftNode = root.left;
        root.left = root.right;
        root.right = temporaryLeftNode;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
