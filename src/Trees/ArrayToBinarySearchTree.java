package Trees;

public class ArrayToBinarySearchTree {
	
	public void createBinarySearchTree(int[] nums, TreeNode root)
	{
		//binary search approach
		root = binarySearchCreate(0, nums.length-1, nums, root);
	}
	
	private TreeNode binarySearchCreate(int low, int high, int[] nums, TreeNode root)
	{
		if(low>high)
		{
			return null;
		}
		int mid=(low+high)/2;
		root = new TreeNode(nums[mid]);
		
		if(mid-1>=0)
		{
			root.left = binarySearchCreate(low, mid-1, nums, root.left);
		}
		if(mid+1<=high)
		{
			root.right = binarySearchCreate(mid+1, high, nums, root.right);
		}
	return root;
}
	
	public static void main (String args[])
	{
		ArrayToBinarySearchTree obj=new ArrayToBinarySearchTree();
		int[] nums={0,1,2,3,4,5,6,7};
		TreeNode root=null;
		obj.createBinarySearchTree(nums,root);
	}
}
