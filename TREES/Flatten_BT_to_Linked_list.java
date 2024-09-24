/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.LinkedList;
import java.util.Queue;

class Solution
{
    public void flatten(TreeNode root)
    {
        Queue<TreeNode> que = new LinkedList<>();
        // Use a helper method to populate the queue
        preOrder(root, que);

        // Now we rebuild the tree from the queue
        TreeNode current = que.poll(); // Take the first node (which is the root)
        while (!que.isEmpty()) {
            current.left = null; // Left child is always null in the flattened tree
            current.right = que.poll(); // Set the right child to the next node in the queue
            current = current.right; // Move to the next node
        }
    }

    // Helper method to perform pre-order traversal and add nodes to the queue
    private void preOrder(TreeNode node, Queue<TreeNode> que) {
        if (node == null) return;

        que.offer(node); // Add the current node to the queue
        preOrder(node.left, que); // Visit the left subtree
        preOrder(node.right, que); // Visit the right subtree
    }
}
