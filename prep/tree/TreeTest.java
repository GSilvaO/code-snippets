package tree;

import java.util.Arrays;

import search.Dfs;

public class TreeTest {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(Arrays.asList(4,2,7,1,3,6,9));
        TreeNode root = binaryTree.getRoot();

        Dfs.search(root);
    }
}
