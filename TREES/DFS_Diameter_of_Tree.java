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
class Solution
{
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root)
    {
        Height(root);     
        return diameter-1;   
    }

    public int Height(TreeNode root)
    {
        if(root == null) return 0;

        int LeftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        diameter = Math.max(diameter, LeftHeight+rightHeight+1);

        return Math.max(LeftHeight,rightHeight) + 1;
    }
}