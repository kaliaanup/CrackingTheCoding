package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderSucessor {

	public List<Integer> inorderTraversal(TreeNode root)
	{
		List<Integer> array=new ArrayList<Integer>();
		inorderTraversal(root, array);
		return array;
	}
	
	public void inorderTraversal(TreeNode root, List<Integer> array)
	{
		if(root==null) return;
		if(root!=null)
		{
			inorderTraversal(root.left, array);
			array.add(root.val);
			inorderTraversal(root.right, array);
		}
	}
	
	public List<Integer> inOrderTraversal1(TreeNode root)
	{
		List<Integer> array=new ArrayList<Integer>();
		if(root==null) return array;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root!=null || !stack.empty())
		{
			while(root!=null)
			{
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			array.add(root.val);
			if(root!=null)
			{
				root=root.right;
			}
		}
		return array;
	}
	
	public int inOrderSuccessor(TreeNode root, int data)
	{
		Stack<TreeNode> stack = new Stack<TreeNode>();
		int prev=0;
		while(root!=null || !stack.empty())
		{
			while(root!=null)
			{
				stack.push(root);
				root = root.left;
			}
			
			root = stack.pop();
			if(prev==data)
			{
				return root.val;
			}
			else
			{
				prev = root.val;
			}
			if(root!=null)
			{
				root=root.right;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String args[])
	{
		TreeNode root=new TreeNode(20);
		root.left=new TreeNode(8);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(12);
		root.left.right.left=new TreeNode(10);
		root.left.right.right=new TreeNode(14);
		
		
		root.right = new TreeNode(22);
		//root.right.left=new TreeNode(3);
		
		
		InOrderSucessor obj =new InOrderSucessor();
		//System.out.println(obj.inOrderTraversal1(root));
		System.out.println(obj.inOrderSuccessor(root, 4));
		
	}
}
