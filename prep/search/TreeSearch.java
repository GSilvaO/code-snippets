package search;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import tree.TreeNode;

public class TreeSearch {

    /**
     * Iterative BFS
     * @param tree
     */
    public static void search(TreeNode tree) {
        Queue<TreeNode> nodesToVisit = new LinkedList<>();

        nodesToVisit.offer(tree);
        
        while(!nodesToVisit.isEmpty()) {
            if(tree.left != null) nodesToVisit.offer(tree.left);
            if(tree.right != null) nodesToVisit.offer(tree.right);
            TreeNode currentNode = nodesToVisit.poll();
            System.out.println(currentNode);
        }

    }
}



