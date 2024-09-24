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
    ArrayList<Integer> arr = new ArrayList<>();

    public boolean isValidBST(TreeNode root)
    {
        helper(root);
        return checkifsorted(arr);
    

        // System.out.println(arr);
        // return true;                        
    }

    public boolean checkifsorted(ArrayList<Integer> arr)
    {
        for(int i = 0 ; i < arr.size()-1; i++)
        {
            if(arr.get(i) >= arr.get(i+1))
            {
                return false;                
            }
        }
        return true;
    }
    public void helper(TreeNode root)
    {
        if(root == null) return;

        helper(root.left);
        arr.add(root.val);
        helper(root.right);
    }
}