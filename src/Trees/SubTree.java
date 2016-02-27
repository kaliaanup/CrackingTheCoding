package Trees;

import Trees.TreeNode;

public class SubTree {

	public boolean isSubTree(TreeNode root, TreeNode node)
	{
		if(node == null) return true;
		if(root == null) return false;
		
		//check if they are identical
		
		if(isSameTree(root,node)) return true;
		
		boolean left = isSubTree(root.left, node);
		boolean right = isSubTree(root.right, node);
		
		if(left || right) return true;
		return false;
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)return true;
        if(p == null || q == null)return false;
        
        return (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)); 
    }
}
