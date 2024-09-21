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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
        List<List<Integer>> res = new ArrayList<>();
        int cnt = 0;

        if(root == null)
        {
            return res;
        }        

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty())
        {
            int levelSize = queue.size();
            List<Integer> ans = new ArrayList<>();
            

            for(int i = 0 ; i < levelSize ; i++)
            {
                TreeNode currNode = queue.poll();
                ans.add(currNode.val);
            

            if(currNode.left != null)
            {
                queue.offer(currNode.left);
            }

            if(currNode.right != null)
            {
                queue.offer(currNode.right);
            }

            }

            cnt++;

            if(cnt % 2 == 0)
            {
                Collections.reverse(ans);
            }

            res.add(ans);
        }

        return res;
    }
}