package DynamicProgramming;

public class MagicNumber {
	
	public int findMagicNumber(int[] nums)
	{
		return searchMagicNumber(0, nums.length-1, nums);
	}
	
	//if all the numbers are sorted and distinct
	public int searchMagicNumber(int low, int high, int[] nums)
	{
		if(low>high) return -1;
		
		int mid = (low+high)/2;
		if(nums[mid] == mid)
		{
			return mid;
		}
		else if(nums[mid]<mid)
		{
			return searchMagicNumber(mid+1, high, nums);
		}
		else
		{
			return searchMagicNumber(low, mid-1, nums);
		}
	}
	//if numbers are not distinct
	public int searchMagicNumber1(int low, int high, int[] nums)
	{
		if(low>high) return -1;
		
		int mid = (low+high)/2;
		int val = nums[mid];
		if(mid == val)
		{
			return mid;
		}
		int leftIndex = Math.min(mid-1, val);
		int left = searchMagicNumber1(low, leftIndex, nums);
		if(left>=0) return left;
		
		int rightIndex = Math.min(mid+1, val);
		int right = searchMagicNumber1(rightIndex, high, nums);
		return right;
	}
	
	public static void main(String args[])
	{
		MagicNumber obj = new MagicNumber();
		int[] nums={-1,0,1,3,6,9};
		System.out.println(obj.findMagicNumber(nums));
	}
}
