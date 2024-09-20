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
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        while(!que.isEmpty())
        {
            int levelsize = que.size();
            ArrayList<Integer> levelnode = new ArrayList<>();


            for(int i = 0 ; i < levelsize ; i++)
            {
                TreeNode currNode = que.poll();
                levelnode.add(currNode.val);

                if(currNode.left != null)
                {
                    que.offer(currNode.left);
                }

                if(currNode.right != null)
                {
                    que.offer(currNode.right);
                }
            }

            result.add(levelnode);
        }


        return result;
                
    }
}