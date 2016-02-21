package Trees;

import Trees.TreeNode;

public class BinaryTreeIsBInarySearchTree {

	public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
    public boolean isValidBST(TreeNode root, Integer min, Integer max) {
    	if(root == null)return true;
    	if(min!=null && root.val<=min) return false;
    	if(max!=null && root.val>=max) return false;
			
    	return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
	public static void main(String args[])
	{
		TreeNode root=new TreeNode(4);
		root.left = new TreeNode(3);
		root.right = new TreeNode(7);
		
		
		BinaryTreeIsBInarySearchTree obj = new BinaryTreeIsBInarySearchTree();
		System.out.println(obj.isValidBST(root));
		
	}
}
