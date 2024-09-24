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



/*
Given the root of a binary tree and an integer targetSum,
 return true if the tree has a root-to-leaf path such that 
 adding up all the values along the path equals targetSum.
*/

class Solution
{
    public boolean hasPathSum(TreeNode root, int targetSum)
    {
        if(root == null) return false;

        if(root.val == targetSum && root.left == null && root.right == null)
        {
            return true;
        }

        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
        
    }
}