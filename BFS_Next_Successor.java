public class BFS_Next_Successor
{

    public static TreeNode nextsuc(TreeNode root, int key)
    {
        if(root == null)
        {
            return null;
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        while(!que.isEmpty())
        {
            TreeNode currNode = que.poll();
            if(currNode.left != null)
            {
                que.offer(currNode.left);
            }
            if(currNode.right != null)
            {
                que.offer(currNode.right);
            }

            if(currNode.val == key)
            {
                break;
            }
        }
        return que.peek();
    }
}