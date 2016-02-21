package Trees;

import Trees.TreeNode;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        else
        {
        	if(depth(root)!= -1)
        	{
        		return true;
        	}
        }
        return false;
    }
	
	public int depth(TreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		else
		{
			int leftDepth = depth(root.left);
            int rightDepth = depth(root.right);
            int diff = Math.abs(leftDepth - rightDepth);
            if(leftDepth == -1 || rightDepth == -1 || diff > 1)
            {
            	return -1;
            }
            else 
            {
            	return Math.max(leftDepth, rightDepth)+1;
            }
      }
	}
}
