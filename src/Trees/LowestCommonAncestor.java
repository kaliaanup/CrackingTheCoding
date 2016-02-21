package Trees;

import Trees.TreeNode;

public class LowestCommonAncestor {
public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null)
		{
			return null;
		}
        if(root == p)
        {
        	return p;
        }
        if(root == q)
        {
        	return q;
        }
        TreeNode left = lowestCommonAncestor1(root.left, p, q);
        TreeNode right = lowestCommonAncestor1(root.right, p, q);
        
        if(left == null && right == null)
        {
        	return null;
        }
        if(left != null && right == null)
        {
        	return left;
        }
        if(right != null && left == null)
        {
        	return right;
        }
        return root;
    }

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null  || root==p || root==q)return root;
		
		TreeNode left = lowestCommonAncestor(root.left, p, q);
	    TreeNode right = lowestCommonAncestor(root.right, p, q);
	        
        if(left!=null && right!=null)
        {
        	return root;
        }
        else if(left!=null && right==null)
        {
        	return left;
        }
        else if(left==null && right!=null)
        {
        	return right;
        }
        else if(left==null && right==null)
        {
        	return null;
        }
	    return root;
	}
	public static void main(String args[])
	{
		TreeNode root=new TreeNode(3);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		
		
		root.right = new TreeNode(1);
		root.right.left=new TreeNode(0);
		root.right.right=new TreeNode(8);
		
		
		LowestCommonAncestor obj = new LowestCommonAncestor();
		//System.out.println(obj.isSymmetric1(root));
		
		
		
		//System.out.println(obj.isSymmetric1(root1));
		//System.out.println(obj.hasPathSum(root,27));
		//System.out.println(obj.lowestCommonAncestor2(root,root.left.left.left,root.left).val);
		//System.out.println(obj.lowestCommonAncestor2(root, root.left.left.left, root.left.left.right).val);
		//System.out.println(obj.levelOrder(root));
		System.out.println(obj.lowestCommonAncestor(root,root.left.left,root.left.right).val);
		
	}
}
